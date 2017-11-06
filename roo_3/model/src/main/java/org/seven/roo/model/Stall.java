package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_stall database table.
 * 
 */
@Entity
@Table(name="t_stall")
@NamedQuery(name="Stall.findAll", query="SELECT s FROM Stall s")
public class Stall implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="admin_id")
	private int adminId;

	@Column(name="business_name")
	private String businessName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="goods_type_id")
	private String goodsTypeId;

	private String introduction;

	@Column(name="is_vip")
	private int isVip;

	private String phone;

	private String photo;

	private BigDecimal score;

	@Column(name="stall_name")
	private String stallName;

	@Column(name="stall_no")
	private int stallNo;

	@Column(name="stall_type")
	private String stallType;

	public Stall() {
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

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getIsVip() {
		return this.isVip;
	}

	public void setIsVip(int isVip) {
		this.isVip = isVip;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public String getStallName() {
		return this.stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getStallNo() {
		return this.stallNo;
	}

	public void setStallNo(int stallNo) {
		this.stallNo = stallNo;
	}

	public String getStallType() {
		return this.stallType;
	}

	public void setStallType(String stallType) {
		this.stallType = stallType;
	}

}