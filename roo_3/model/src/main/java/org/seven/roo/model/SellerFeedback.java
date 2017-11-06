package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_seller_feedback database table.
 * 
 */
@Entity
@Table(name="t_seller_feedback")
@NamedQuery(name="SellerFeedback.findAll", query="SELECT s FROM SellerFeedback s")
public class SellerFeedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="feedback_type")
	private int feedbackType;

	private String introduction;

	private String photo;

	@Column(name="seller_id")
	private int sellerId;

	private int status;

	public SellerFeedback() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getFeedbackType() {
		return this.feedbackType;
	}

	public void setFeedbackType(int feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}