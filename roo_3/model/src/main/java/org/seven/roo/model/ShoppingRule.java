package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_shopping_rule database table.
 * 
 */
@Entity
@Table(name="t_shopping_rule")
@NamedQuery(name="ShoppingRule.findAll", query="SELECT s FROM ShoppingRule s")
public class ShoppingRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int day;

	private byte flag;

	private byte type;

	public ShoppingRule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}