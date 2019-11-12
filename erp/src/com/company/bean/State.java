package com.company.bean;

/**
 * @author Davi
 * @category 订单状态表
 */
public class State {
	/**
	 * 状态ID
	 */
	private int stateId;
	/**
	 * 状态名称
	 */
	private String statename;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public State(int stateId, String statename) {
		super();
		this.stateId = stateId;
		this.statename = statename;
	}

	public State() {
		super();
	}

}
