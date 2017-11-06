package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_food_market database table.
 * 
 */
@Entity
@Table(name="t_food_market")
@NamedQuery(name="FoodMarket.findAll", query="SELECT f FROM FoodMarket f")
public class FoodMarket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	@Column(name="agent_id")
	private int agentId;

	@Column(name="china_id")
	private String chinaId;

	@Column(name="city_id")
	private int cityId;

	@Column(name="comment_count")
	private int commentCount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="delivery_scope")
	private String deliveryScope;

	private byte flag;

	@Column(name="food_market_code")
	private String foodMarketCode;

	@Column(name="food_market_name")
	private String foodMarketName;

	@Column(name="gaode_id")
	private int gaodeId;

	@Column(name="goods_score")
	private BigDecimal goodsScore;

	private String introduction;

	private String location;

	@Column(name="packing_score")
	private BigDecimal packingScore;

	private String password;

	private String phone;

	@Column(name="photo_url")
	private String photoUrl;

	private BigDecimal score;

	@Column(name="sent_score")
	private BigDecimal sentScore;

	@Column(name="stall_type_id")
	private String stallTypeId;

	private int status;

	private String token;

	private String username;

	public FoodMarket() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getChinaId() {
		return this.chinaId;
	}

	public void setChinaId(String chinaId) {
		this.chinaId = chinaId;
	}

	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeliveryScope() {
		return this.deliveryScope;
	}

	public void setDeliveryScope(String deliveryScope) {
		this.deliveryScope = deliveryScope;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getFoodMarketCode() {
		return this.foodMarketCode;
	}

	public void setFoodMarketCode(String foodMarketCode) {
		this.foodMarketCode = foodMarketCode;
	}

	public String getFoodMarketName() {
		return this.foodMarketName;
	}

	public void setFoodMarketName(String foodMarketName) {
		this.foodMarketName = foodMarketName;
	}

	public int getGaodeId() {
		return this.gaodeId;
	}

	public void setGaodeId(int gaodeId) {
		this.gaodeId = gaodeId;
	}

	public BigDecimal getGoodsScore() {
		return this.goodsScore;
	}

	public void setGoodsScore(BigDecimal goodsScore) {
		this.goodsScore = goodsScore;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BigDecimal getPackingScore() {
		return this.packingScore;
	}

	public void setPackingScore(BigDecimal packingScore) {
		this.packingScore = packingScore;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public BigDecimal getSentScore() {
		return this.sentScore;
	}

	public void setSentScore(BigDecimal sentScore) {
		this.sentScore = sentScore;
	}

	public String getStallTypeId() {
		return this.stallTypeId;
	}

	public void setStallTypeId(String stallTypeId) {
		this.stallTypeId = stallTypeId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}