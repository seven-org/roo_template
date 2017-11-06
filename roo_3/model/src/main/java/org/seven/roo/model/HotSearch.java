package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hot_search database table.
 * 
 */
@Entity
@Table(name="t_hot_search")
@NamedQuery(name="HotSearch.findAll", query="SELECT h FROM HotSearch h")
public class HotSearch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private byte flag;

	@Column(name="food_market_id")
	private int foodMarketId;

	@Column(name="search_name")
	private String searchName;

	public HotSearch() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public int getFoodMarketId() {
		return this.foodMarketId;
	}

	public void setFoodMarketId(int foodMarketId) {
		this.foodMarketId = foodMarketId;
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}