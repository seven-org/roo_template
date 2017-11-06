package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_agent_cost database table.
 * 
 */
@Embeddable
public class AgentCostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="agent_id")
	private int agentId;

	private byte type;

	public AgentCostPK() {
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
	public byte getType() {
		return this.type;
	}
	public void setType(byte type) {
		this.type = type;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AgentCostPK)) {
			return false;
		}
		AgentCostPK castOther = (AgentCostPK)other;
		return 
			(this.id == castOther.id)
			&& (this.agentId == castOther.agentId)
			&& (this.type == castOther.type);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.agentId;
		hash = hash * prime + ((int) this.type);
		
		return hash;
	}
}