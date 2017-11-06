package org.seven.roo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_agent_activity database table.
 * 
 */
@Entity
@Table(name="t_agent_activity")
@NamedQuery(name="AgentActivity.findAll", query="SELECT a FROM AgentActivity a")
public class AgentActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="activity_flag")
	private int activityFlag;

	@Column(name="agent_id")
	private int agentId;

	private int type;

	public AgentActivity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActivityFlag() {
		return this.activityFlag;
	}

	public void setActivityFlag(int activityFlag) {
		this.activityFlag = activityFlag;
	}

	public int getAgentId() {
		return this.agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}