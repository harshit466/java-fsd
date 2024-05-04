package coms.Phase3_Practiceproject6.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

import coms.Phase3_Practiceproject6.entities.FilesInfo;


public interface FilesService {

	public String FileUpload(MultipartFile file);
	public List<FilesInfo>  ShowAll();
	public FilesInfo GetAFile(String fileid);
}