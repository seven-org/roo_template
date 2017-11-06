package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_activity database table.
 * 
 */
@Embeddable
public class ActivityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	private byte type;

	@Column(name="activity_type")
	private byte activityType;

	@Column(name="agent_id")
	private int agentId;

	public ActivityPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte getType() {
		return this.type;
	}
	public void setType(byte type) {
		this.type = type;
	}
	public byte getActivityType() {
		return this.activityType;
	}
	public void setActivityType(byte activityType) {
		this.activityType = activityType;
	}
	public int getAgentId() {
		return this.agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActivityPK)) {
			return false;
		}
		ActivityPK castOther = (ActivityPK)other;
		return 
			(this.id == castOther.id)
			&& (this.type == castOther.type)
			&& (this.activityType == castOther.activityType)
			&& (this.agentId == castOther.agentId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + ((int) this.type);
		hash = hash * prime + ((int) this.activityType);
		hash = hash * prime + this.agentId;
		
		return hash;
	}
}