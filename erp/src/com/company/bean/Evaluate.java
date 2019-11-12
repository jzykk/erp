package com.company.bean;

import java.sql.Date;

/**
 * @author 姚谍
 * @category 评论表
 */
public class Evaluate {
	/**
	 * 评论Id
	 */
	private int evaluateId;
	/**
	 * 客户编号
	 */
	private int clientid;
	/**
	 * 回访日期
	 */
	private Date evaluatedate;
	/**
	 * 客户评分
	 */
	private int evaluatesco;
	/**
	 * 内容
	 */
	private String content;

	public int getEvaluateId() {
		return evaluateId;
	}

	public void setEvaluateId(int evaluateId) {
		this.evaluateId = evaluateId;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public Date getEvaluatedate() {
		return evaluatedate;
	}

	public void setEvaluatedate(Date evaluatedate) {
		this.evaluatedate = evaluatedate;
	}

	public int getEvaluatesco() {
		return evaluatesco;
	}

	public void setEvaluatesco(int evaluatesco) {
		this.evaluatesco = evaluatesco;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Evaluate(int evaluateId, int clientid, Date evaluatedate, int evaluatesco, String content) {
		super();
		this.evaluateId = evaluateId;
		this.clientid = clientid;
		this.evaluatedate = evaluatedate;
		this.evaluatesco = evaluatesco;
		this.content = content;
	}

	public Evaluate(int clientid, Date evaluatedate, int evaluatesco, String content) {
		super();
		this.clientid = clientid;
		this.evaluatedate = evaluatedate;
		this.evaluatesco = evaluatesco;
		this.content = content;
	}

	public Evaluate() {
		super();
	}

}
