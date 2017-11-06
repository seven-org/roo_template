package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_market_label database table.
 * 
 */
@Entity
@Table(name="t_food_market_label")
@NamedQuery(name="FoodMarketLabel.findAll", query="SELECT f FROM FoodMarketLabel f")
public class FoodMarketLabel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="label_name")
	private String labelName;

	public FoodMarketLabel() {
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

	public String getLabelName() {
		return this.labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}