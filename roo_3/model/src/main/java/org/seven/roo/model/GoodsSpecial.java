package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the t_goods_special database table.
 * 
 */
@Entity
@Table(name="t_goods_special")
@NamedQuery(name="GoodsSpecial.findAll", query="SELECT g FROM GoodsSpecial g")
public class GoodsSpecial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private BigDecimal amount;

	@Column(name="goods_id")
	private int goodsId;

	@Column(name="original_price")
	private BigDecimal originalPrice;

	@Column(name="special_price")
	private BigDecimal specialPrice;

	public GoodsSpecial() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public BigDecimal getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getSpecialPrice() {
		return this.specialPrice;
	}

	public void setSpecialPrice(BigDecimal specialPrice) {
		this.specialPrice = specialPrice;
	}

}