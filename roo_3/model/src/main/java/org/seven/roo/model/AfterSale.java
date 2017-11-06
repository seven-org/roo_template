package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_after_sale database table.
 * 
 */
@Entity
@Table(name="t_after_sale")
@NamedQuery(name="AfterSale.findAll", query="SELECT a FROM AfterSale a")
public class AfterSale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="after_number")
	private String afterNumber;

	@Column(name="after_sale_reason")
	private String afterSaleReason;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String description;

	private int flag;

	@Column(name="order_goods_id")
	private int orderGoodsId;

	@Column(name="order_number")
	private String orderNumber;

	@Column(name="photo_url")
	private String photoUrl;

	@Column(name="sale_type")
	private int saleType;

	private int status;

	@Column(name="user_id")
	private int userId;

	public AfterSale() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAfterNumber() {
		return this.afterNumber;
	}

	public void setAfterNumber(String afterNumber) {
		this.afterNumber = afterNumber;
	}

	public String getAfterSaleReason() {
		return this.afterSaleReason;
	}

	public void setAfterSaleReason(String afterSaleReason) {
		this.afterSaleReason = afterSaleReason;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getOrderGoodsId() {
		return this.orderGoodsId;
	}

	public void setOrderGoodsId(int orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public int getSaleType() {
		return this.saleType;
	}

	public void setSaleType(int saleType) {
		this.saleType = saleType;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}