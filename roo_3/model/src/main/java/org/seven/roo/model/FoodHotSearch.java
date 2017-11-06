package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_food_hot_search database table.
 * 
 */
@Entity
@Table(name="t_food_hot_search")
@NamedQuery(name="FoodHotSearch.findAll", query="SELECT f FROM FoodHotSearch f")
public class FoodHotSearch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="agent_id")
	private int agentId;

	private byte flag;

	@Column(name="search_name")
	private String searchName;

	public FoodHotSearch() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}