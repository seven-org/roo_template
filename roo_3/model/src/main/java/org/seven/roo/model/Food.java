package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_food database table.
 * 
 */
@Entity
@Table(name="t_food")
@NamedQuery(name="Food.findAll", query="SELECT f FROM Food f")
public class Food implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	@Column(name="cook_step_rich_text")
	private String cookStepRichText;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Lob
	private String detailed;

	private byte flag;

	@Column(name="food_name")
	private String foodName;

	private String introduction;

	@Column(name="photo_url")
	private String photoUrl;

	private byte recommend;

	@Column(name="two_classify_id")
	private int twoClassifyId;

	public Food() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCookStepRichText() {
		return this.cookStepRichText;
	}

	public void setCookStepRichText(String cookStepRichText) {
		this.cookStepRichText = cookStepRichText;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDetailed() {
		return this.detailed;
	}

	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getFoodName() {
		return this.foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public byte getRecommend() {
		return this.recommend;
	}

	public void setRecommend(byte recommend) {
		this.recommend = recommend;
	}

	public int getTwoClassifyId() {
		return this.twoClassifyId;
	}

	public void setTwoClassifyId(int twoClassifyId) {
		this.twoClassifyId = twoClassifyId;
	}

}