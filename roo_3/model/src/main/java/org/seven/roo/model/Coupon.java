package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_coupon database table.
 * 
 */
@Entity
@Table(name="t_coupon")
@NamedQuery(name="Coupon.findAll", query="SELECT c FROM Coupon c")
public class Coupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="coupon_amount")
	private BigInteger couponAmount;

	@Column(name="coupon_code")
	private String couponCode;

	@Column(name="coupon_name")
	private String couponName;

	@Column(name="coupon_type")
	private int couponType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private BigInteger discount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	private byte flag;

	@Column(name="foodmarket_id")
	private int foodmarketId;

	@Column(name="out_date")
	private int outDate;

	@Column(name="rechargecard_id")
	private int rechargecardId;

	@Column(name="stall_type")
	private int stallType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	private int status;

	@Column(name="total_circulation")
	private int totalCirculation;

	@Column(name="users_amount")
	private int usersAmount;

	public Coupon() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getCouponAmount() {
		return this.couponAmount;
	}

	public void setCouponAmount(BigInteger couponAmount) {
		this.couponAmount = couponAmount;
	}

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponName() {
		return this.couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public int getCouponType() {
		return this.couponType;
	}

	public void setCouponType(int couponType) {
		this.couponType = couponType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigInteger discount) {
		this.discount = discount;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public int getFoodmarketId() {
		return this.foodmarketId;
	}

	public void setFoodmarketId(int foodmarketId) {
		this.foodmarketId = foodmarketId;
	}

	public int getOutDate() {
		return this.outDate;
	}

	public void setOutDate(int outDate) {
		this.outDate = outDate;
	}

	public int getRechargecardId() {
		return this.rechargecardId;
	}

	public void setRechargecardId(int rechargecardId) {
		this.rechargecardId = rechargecardId;
	}

	public int getStallType() {
		return this.stallType;
	}

	public void setStallType(int stallType) {
		this.stallType = stallType;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTotalCirculation() {
		return this.totalCirculation;
	}

	public void setTotalCirculation(int totalCirculation) {
		this.totalCirculation = totalCirculation;
	}

	public int getUsersAmount() {
		return this.usersAmount;
	}

	public void setUsersAmount(int usersAmount) {
		this.usersAmount = usersAmount;
	}

}