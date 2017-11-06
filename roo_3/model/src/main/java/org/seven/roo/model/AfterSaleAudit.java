package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_after_sale_audit database table.
 * 
 */
@Entity
@Table(name="t_after_sale_audit")
@NamedQuery(name="AfterSaleAudit.findAll", query="SELECT a FROM AfterSaleAudit a")
public class AfterSaleAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="after_sale_number")
	private String afterSaleNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String description;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="manager_id")
	private int managerId;

	@Column(name="order_goods_id")
	private int orderGoodsId;

	private String photo;

	@Column(name="stall_id")
	private int stallId;

	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	@Column(name="user_id")
	private int userId;

	public AfterSaleAudit() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAfterSaleNumber() {
		return this.afterSaleNumber;
	}

	public void setAfterSaleNumber(String afterSaleNumber) {
		this.afterSaleNumber = afterSaleNumber;
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

	public int getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public int getManagerId() {
		return this.managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getOrderGoodsId() {
		return this.orderGoodsId;
	}

	public void setOrderGoodsId(int orderGoodsId) {
		this.orderGoodsId = orderGoodsId;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}