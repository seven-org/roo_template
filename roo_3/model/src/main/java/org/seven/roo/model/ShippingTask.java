package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_shipping_task database table.
 * 
 */
@Entity
@Table(name="t_shipping_task")
@NamedQuery(name="ShippingTask.findAll", query="SELECT s FROM ShippingTask s")
public class ShippingTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="begin_time")
	private Date beginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="exception_photo")
	private String exceptionPhoto;

	@Column(name="exception_status")
	private int exceptionStatus;

	@Column(name="order_number")
	private String orderNumber;

	private String remark;

	@Column(name="shipping_center_id")
	private int shippingCenterId;

	@Column(name="shipping_id")
	private int shippingId;

	@Column(name="shipping_price")
	private BigInteger shippingPrice;

	private int status;

	@Column(name="ticket_photo")
	private String ticketPhoto;

	public ShippingTask() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExceptionPhoto() {
		return this.exceptionPhoto;
	}

	public void setExceptionPhoto(String exceptionPhoto) {
		this.exceptionPhoto = exceptionPhoto;
	}

	public int getExceptionStatus() {
		return this.exceptionStatus;
	}

	public void setExceptionStatus(int exceptionStatus) {
		this.exceptionStatus = exceptionStatus;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getShippingCenterId() {
		return this.shippingCenterId;
	}

	public void setShippingCenterId(int shippingCenterId) {
		this.shippingCenterId = shippingCenterId;
	}

	public int getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	public BigInteger getShippingPrice() {
		return this.shippingPrice;
	}

	public void setShippingPrice(BigInteger shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTicketPhoto() {
		return this.ticketPhoto;
	}

	public void setTicketPhoto(String ticketPhoto) {
		this.ticketPhoto = ticketPhoto;
	}

}