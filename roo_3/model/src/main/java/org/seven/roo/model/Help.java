package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_help database table.
 * 
 */
@Entity
@Table(name="t_help")
@NamedQuery(name="Help.findAll", query="SELECT h FROM Help h")
public class Help implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int classification;

	@Lob
	private String content;

	private int special;

	private String title;

	public Help() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassification() {
		return this.classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getSpecial() {
		return this.special;
	}

	public void setSpecial(int special) {
		this.special = special;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}