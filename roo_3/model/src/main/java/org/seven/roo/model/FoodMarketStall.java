package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_market_stall database table.
 * 
 */
@Entity
@Table(name="t_food_market_stall")
@NamedQuery(name="FoodMarketStall.findAll", query="SELECT f FROM FoodMarketStall f")
public class FoodMarketStall implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="stall_id")
	private int stallId;

	public FoodMarketStall() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public int getStallId() {
		return this.stallId;
	}

	public void setStallId(int stallId) {
		this.stallId = stallId;
	}

}