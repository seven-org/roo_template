package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_order_goods database table.
 * 
 */
@Entity
@Table(name="t_order_goods")
@NamedQuery(name="OrderGood.findAll", query="SELECT o FROM OrderGood o")
public class OrderGood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int amount;

	@Column(name="amount_unit_id")
	private int amountUnitId;

	@Column(name="amount_unit_name")
	private String amountUnitName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private int flag;

	@Column(name="goods_id")
	private int goodsId;

	@Column(name="goods_image")
	private String goodsImage;

	@Column(name="goods_name")
	private String goodsName;

	@Column(name="item_id")
	private int itemId;

	@Column(name="order_number")
	private String orderNumber;

	private BigInteger price;

	@Column(name="real_amount")
	private BigDecimal realAmount;

	@Column(name="stall_id")
	private int stallId;

	@Column(name="stall_name")
	private String stallName;

	@Column(name="stall_no")
	private String stallNo;

	@Column(name="stall_phone")
	private String stallPhone;

	private int status;

	@Column(name="total_amount")
	private int totalAmount;

	public OrderGood() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmountUnitId() {
		return this.amountUnitId;
	}

	public void setAmountUnitId(int amountUnitId) {
		this.amountUnitId = amountUnitId;
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

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsImage() {
		return this.goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public BigInteger getPrice() {
		return this.price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public BigDecimal getRealAmount() {
		return this.realAmount;
	}

	public void setRealAmount(BigDecimal realAmount) {
		this.realAmount = realAmount;
	}

	public int getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public String getStallName() {
		return this.stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getStallNo() {
		return this.stallNo;
	}

	public void setStallNo(String stallNo) {
		this.stallNo = stallNo;
	}

	public String getStallPhone() {
		return this.stallPhone;
	}

	public void setStallPhone(String stallPhone) {
		this.stallPhone = stallPhone;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}