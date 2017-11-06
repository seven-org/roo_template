package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_two_classify database table.
 * 
 */
@Entity
@Table(name="t_food_two_classify")
@NamedQuery(name="FoodTwoClassify.findAll", query="SELECT f FROM FoodTwoClassify f")
public class FoodTwoClassify implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="classify_name")
	private String classifyName;

	private byte flag;

	@Column(name="one_classify_id")
	private int oneClassifyId;

	private String photo;

	private int status;

	public FoodTwoClassify() {
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

	public int getOneClassifyId() {
		return this.oneClassifyId;
	}

	public void setOneClassifyId(int oneClassifyId) {
		this.oneClassifyId = oneClassifyId;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}