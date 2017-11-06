package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_stall_comment database table.
 * 
 */
@Entity
@Table(name="t_stall_comment")
@NamedQuery(name="StallComment.findAll", query="SELECT s FROM StallComment s")
public class StallComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int anonymous;

	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="delivery_time")
	private int deliveryTime;

	@Column(name="label_id")
	private int labelId;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="stall_id")
	private int stallId;

	@Column(name="stall_score")
	private BigDecimal stallScore;

	@Column(name="user_id")
	private int userId;

	public StallComment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(int anonymous) {
		this.anonymous = anonymous;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public int getLabelId() {
		return this.labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public BigDecimal getStallScore() {
		return this.stallScore;
	}

	public void setStallScore(BigDecimal stallScore) {
		this.stallScore = stallScore;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}