package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_rechargecard database table.
 * 
 */
@Entity
@Table(name="t_rechargecard")
@NamedQuery(name="Rechargecard.findAll", query="SELECT r FROM Rechargecard r")
public class Rechargecard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String content;

	@Column(name="font_color")
	private String fontColor;

	@Column(name="give_money")
	private BigInteger giveMoney;

	private BigInteger money;

	private String photo;

	public Rechargecard() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFontColor() {
		return this.fontColor;
	}

	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}

	public BigInteger getGiveMoney() {
		return this.giveMoney;
	}

	public void setGiveMoney(BigInteger giveMoney) {
		this.giveMoney = giveMoney;
	}

	public BigInteger getMoney() {
		return this.money;
	}

	public void setMoney(BigInteger money) {
		this.money = money;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}