package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_page database table.
 * 
 */
@Entity
@Table(name="t_page")
@NamedQuery(name="Page.findAll", query="SELECT p FROM Page p")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="category_id")
	private int categoryId;

	private int comments;

	@Lob
	private String content;

	private int createtime;

	private Object flag;

	private String icon;

	private String image;

	private String keywords;

	private String status;

	private String title;

	private int updatetime;

	private int views;

	private int weigh;

	public Page() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getComments() {
		return this.comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(int createtime) {
		this.createtime = createtime;
	}

	public Object getFlag() {
		return this.flag;
	}

	public void setFlag(Object flag) {
		this.flag = flag;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getWeigh() {
		return this.weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

}