package coms.Phase3_Practiceproject6.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import coms.Phase3_Practiceproject6.entities.FilesInfo;
import coms.Phase3_Practiceproject6.entities.ResponseUrlInfo;
import coms.Phase3_Practiceproject6.service.FilesService;


@RestController
public class FilesController {

	@Autowired
	FilesService fs;
	
	@PostMapping("/fupload")
	public ResponseEntity<Object> FileUploadInfo(@RequestParam("finfo") MultipartFile file)
	{
		if(fs.FileUpload(file).equals("Success"))
			return new ResponseEntity<Object>("File Uploaded Successfully", HttpStatus.OK);
		
		return new ResponseEntity<Object>("File Not Uploaded", HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/showall")
	public ResponseEntity<List<ResponseUrlInfo>> GetAllFiles()
	{
		List<ResponseUrlInfo>  responseAll = new ArrayList<ResponseUrlInfo>();
		ResponseUrlInfo rinfo = null;
		
		List<FilesInfo>  files_all = fs.ShowAll();
		
		for(FilesInfo f : files_all)
		{
			String fileDownloadUrl = ServletUriComponentsBuilder
			          .fromCurrentContextPath()  // servername : http://localhost:9092
			          .path("/files/")		// getmapping text
			          .path(f.getFileid())  // id value from db
			          .toUriString();
			
			System.out.println(fileDownloadUrl);
			
			rinfo = new ResponseUrlInfo();
			rinfo.setFilename(f.getFilename());
			rinfo.setFilesize(f.getFiledata().length);
			rinfo.setFileUrl(fileDownloadUrl);
			responseAll.add(rinfo);
		}
		
		return new ResponseEntity<List<ResponseUrlInfo>>(responseAll, HttpStatus.OK);
	}
	
	@GetMapping("/files/{id}")
	public ResponseEntity<byte[]>  GetFileDownload(@PathVariable("id") String id)	
	{
		FilesInfo finfo = fs.GetAFile(id);
		if(finfo!=null)
		{
			//  download the file
			return ResponseEntity.ok()
			        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + finfo.getFilename() + "\"")
			        .body(finfo.getFiledata());
		}

		return  new ResponseEntity("File Not Found", HttpStatus.NOT_FOUND); 
	}
	
}