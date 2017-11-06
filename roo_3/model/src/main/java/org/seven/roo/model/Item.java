package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_item database table.
 * 
 */
@Entity
@Table(name="t_item")
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="amount_unit_name")
	private String amountUnitName;

	@Column(name="banner_image")
	private String bannerImage;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private int discount;

	@Column(name="discount_price")
	private BigInteger discountPrice;

	private int flag;

	@Column(name="goods_id")
	private int goodsId;

	@Column(name="hot_sell")
	private int hotSell;

	private String introduction;

	@Column(name="new_goods")
	private int newGoods;

	private BigInteger price;

	private int recommend;

	@Column(name="stall_id")
	private int stallId;

	private byte status;

	public Item() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmountUnitName() {
		return this.amountUnitName;
	}

	public void setAmountUnitName(String amountUnitName) {
		this.amountUnitName = amountUnitName;
	}

	public String getBannerImage() {
		return this.bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getDiscount() {
		return this.discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
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

	public int getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getHotSell() {
		return this.hotSell;
	}

	public void setHotSell(int hotSell) {
		this.hotSell = hotSell;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getNewGoods() {
		return this.newGoods;
	}

	public void setNewGoods(int newGoods) {
		this.newGoods = newGoods;
	}

	public BigInteger getPrice() {
		return this.price;
	}

	public void setPrice(BigInteger price) {
		this.price = price;
	}

	public int getRecommend() {
		return this.recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public int getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}