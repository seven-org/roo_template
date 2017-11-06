package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_attachment database table.
 * 
 */
@Entity
@Table(name="t_attachment")
@NamedQuery(name="Attachment.findAll", query="SELECT a FROM Attachment a")
public class Attachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int createtime;

	private String extparam;

	private int filesize;

	private int imageframes;

	private String imageheight;

	private String imagetype;

	private String imagewidth;

	private String mimetype;

	private String sha1;

	private String storage;

	private int updatetime;

	private int uploadtime;

	private String url;

	public Attachment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}

	public String getExtparam() {
		return this.extparam;
	}

	public void setExtparam(String extparam) {
		this.extparam = extparam;
	}

	public int getFilesize() {
		return this.filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public int getImageframes() {
		return this.imageframes;
	}

	public void setImageframes(int imageframes) {
		this.imageframes = imageframes;
	}

	public String getImageheight() {
		return this.imageheight;
	}

	public void setImageheight(String imageheight) {
		this.imageheight = imageheight;
	}

	public String getImagetype() {
		return this.imagetype;
	}

	public void setImagetype(String imagetype) {
		this.imagetype = imagetype;
	}

	public String getImagewidth() {
		return this.imagewidth;
	}

	public void setImagewidth(String imagewidth) {
		this.imagewidth = imagewidth;
	}

	public String getMimetype() {
		return this.mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public String getSha1() {
		return this.sha1;
	}

	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}

	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public int getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

	public int getUploadtime() {
		return this.uploadtime;
	}

	public void setUploadtime(int uploadtime) {
		this.uploadtime = uploadtime;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}