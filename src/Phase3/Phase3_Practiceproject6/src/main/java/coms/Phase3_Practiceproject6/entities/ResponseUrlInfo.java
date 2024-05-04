package coms.Phase3_Practiceproject6.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseUrlInfo {

	private String filename;
	private int filesize;
	private String fileUrl;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	
	
}