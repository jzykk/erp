package com.company.vo;

import java.sql.Date;

/**
 * @author yd
 * @category EvaluateVO
 *
 */
public class EvaluateVO {
	/**
	 * 评论Id
	 */
	private int evaluateId;
	/**
	 * 客户编号
	 */
	private int clientid;
	/**
	 * 客户姓名
	 */
	private String clientname;
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
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
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
	public EvaluateVO(int evaluateId, int clientid, String clientname, Date evaluatedate, int evaluatesco,
			String content) {
		super();
		this.evaluateId = evaluateId;
		this.clientid = clientid;
		this.clientname = clientname;
		this.evaluatedate = evaluatedate;
		this.evaluatesco = evaluatesco;
		this.content = content;
	}
	public EvaluateVO() {
		super();
	}
	
	
	
	
}
