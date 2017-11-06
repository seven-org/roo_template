package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_amount_unit database table.
 * 
 */
@Entity
@Table(name="t_amount_unit")
@NamedQuery(name="AmountUnit.findAll", query="SELECT a FROM AmountUnit a")
public class AmountUnit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="amount_unit_name")
	private String amountUnitName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="discount_price")
	private BigInteger discountPrice;

	private int flag;

	@Column(name="item_id")
	private int itemId;

	private BigInteger price;

	@Column(name="update_id")
	private int updateId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_time")
	private Date updateTime;

	public AmountUnit() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAmountUnitName() {
		return this.amountUnitName;
	}

	public void setAmountUnitName(String amountUnitName) {
		this.amountUnitName = amountUnitName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getDiscountPrice() {
		return this.discountPrice;
	}

	public void setDiscountPrice(BigInteger discountPrice) {
		this.discountPrice = discountPrice;
	}

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public BigInteger getPrice() {
		return this.price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public int getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(int updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}