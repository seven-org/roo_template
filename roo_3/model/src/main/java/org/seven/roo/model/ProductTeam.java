package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_product_team database table.
 * 
 */
@Entity
@Table(name="t_product_team")
@NamedQuery(name="ProductTeam.findAll", query="SELECT p FROM ProductTeam p")
public class ProductTeam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="interface_user")
	private String interfaceUser;

	@Column(name="official_qq")
	private String officialQq;

	@Column(name="official_url")
	private String officialUrl;

	private String plan;

	@Column(name="product_design")
	private String productDesign;

	public ProductTeam() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInterfaceUser() {
		return this.interfaceUser;
	}

	public void setInterfaceUser(String interfaceUser) {
		this.interfaceUser = interfaceUser;
	}

	public String getOfficialQq() {
		return this.officialQq;
	}

	public void setOfficialQq(String officialQq) {
		this.officialQq = officialQq;
	}

	public String getOfficialUrl() {
		return this.officialUrl;
	}

	public void setOfficialUrl(String officialUrl) {
		this.officialUrl = officialUrl;
	}

	public String getPlan() {
		return this.plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getProductDesign() {
		return this.productDesign;
	}

	public void setProductDesign(String productDesign) {
		this.productDesign = productDesign;
	}

}