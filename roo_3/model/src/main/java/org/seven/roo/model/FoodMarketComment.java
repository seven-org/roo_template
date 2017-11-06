package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_food_market_comment database table.
 * 
 */
@Entity
@Table(name="t_food_market_comment")
@NamedQuery(name="FoodMarketComment.findAll", query="SELECT f FROM FoodMarketComment f")
public class FoodMarketComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int anonymous;

	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="goods_score")
	private BigDecimal goodsScore;

	@Column(name="label_id")
	private int labelId;

	@Column(name="packing_score")
	private BigDecimal packingScore;

	@Column(name="sent_score")
	private BigDecimal sentScore;

	@Column(name="user_id")
	private int userId;

	public FoodMarketComment() {
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

	public int getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public BigDecimal getGoodsScore() {
		return this.goodsScore;
	}

	public void setGoodsScore(BigDecimal goodsScore) {
		this.goodsScore = goodsScore;
	}

	public int getLabelId() {
		return this.labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public BigDecimal getPackingScore() {
		return this.packingScore;
	}

	public void setPackingScore(BigDecimal packingScore) {
		this.packingScore = packingScore;
	}

	public BigDecimal getSentScore() {
		return this.sentScore;
	}

	public void setSentScore(BigDecimal sentScore) {
		this.sentScore = sentScore;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}