package coms.Phase3_Practiceproject6.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Files_Infos")
@Getter
@Setter
public class FilesInfo {

	@Id
	@GeneratedValue(generator = "uuid")
 	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String fileid;
	
	private String filename;
	private String filetype;
	
	@Lob // it will refer in database column type as Blob(Binary Large Objects).
	@Column(columnDefinition="LONGBLOB")
	private byte[] filedata;

	public String getFileid() {
		return fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public byte[] getFiledata() {
		return filedata;
	}

	public void setFiledata(byte[] filedata) {
		this.filedata = filedata;
	}
	
	
}