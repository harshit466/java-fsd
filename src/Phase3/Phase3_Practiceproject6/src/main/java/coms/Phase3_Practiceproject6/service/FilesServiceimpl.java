package coms.Phase3_Practiceproject6.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import coms.Phase3_Practiceproject6.entities.FilesInfo;
import coms.Phase3_Practiceproject6.repo.FilesRepo;


@Service
public class FilesServiceimpl implements FilesService {

	@Autowired
	FilesRepo fr;
	
	@Override
	public String FileUpload(MultipartFile file) {
		String res = "err";
		try
		{
		FilesInfo fileinfo = new FilesInfo();
		
		fileinfo.setFilename(file.getOriginalFilename());
		fileinfo.setFiletype(file.getContentType());

		fileinfo.setFiledata(file.getBytes());

		FilesInfo f = fr.save(fileinfo);
		if(f!=null)
			res ="Success";

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return res;
	}

	@Override
	public List<FilesInfo> ShowAll() {
		// TODO Auto-generated method stub
		return fr.findAll();
	}

	@Override
	public FilesInfo GetAFile(String fileid) {

		Optional<FilesInfo>  fos = fr.findById(fileid);
		if(fos.isPresent())
			return fos.get();
		
		return null;
	}

	
}