package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_one_classify database table.
 * 
 */
@Entity
@Table(name="t_food_one_classify")
@NamedQuery(name="FoodOneClassify.findAll", query="SELECT f FROM FoodOneClassify f")
public class FoodOneClassify implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="classify_name")
	private String classifyName;

	private byte flag;

	private String photo;

	public FoodOneClassify() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassifyName() {
		return this.classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}