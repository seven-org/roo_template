package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_agent_cost database table.
 * 
 */
@Entity
@Table(name="t_agent_cost")
@NamedQuery(name="AgentCost.findAll", query="SELECT a FROM AgentCost a")
public class AgentCost implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AgentCostPK id;

	private BigInteger money;

	public AgentCost() {
	}

	public AgentCostPK getId() {
		return this.id;
	}

	public void setId(AgentCostPK id) {
		this.id = id;
	}

	public BigInteger getMoney() {
		return this.money;
	}

	public void setMoney(BigInteger money) {
		this.money = money;
	}

}