package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_round database table.
 * 
 */
@Entity
@Table(name="t_food_round")
@NamedQuery(name="FoodRound.findAll", query="SELECT f FROM FoodRound f")
public class FoodRound implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="food_id")
	private int foodId;

	public FoodRound() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFoodId() {
		return this.foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

}