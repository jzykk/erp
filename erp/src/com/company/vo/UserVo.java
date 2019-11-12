package com.company.vo;

import java.sql.Date;

/**
 * @author yd
 * @category 员工用户的vo
 *
 */
public class UserVo {
	/**
	 * 员工编号
	 */
	private int id;
	/**
	 * 职务编号
	 */
	private int did;
	/**
	 * 职务名字
	 */
	private String dname;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 密码
	 */
	private String pass;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 身份证号
	 */
	private String card;
	/**
	 * 住址
	 */
	private String address;
	/**
	 * 入职时间
	 */
	private String inputdate;
	/**
	 * 住址
	 */
	private String picture;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public UserVo(int id, int did, String dname, String name, String pass, String sex, int age, String tel, String card,
			String address, String inputdate, String picture) {
		super();
		this.id = id;
		this.did = did;
		this.dname = dname;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
		this.inputdate = inputdate;
		this.picture = picture;
	}
	public UserVo(int id, int did, String dname, String name, String pass, String sex, int age, String tel, String card,
			String address, String inputdate) {
		super();
		this.id = id;
		this.did = did;
		this.dname = dname;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
		this.inputdate = inputdate;
	}
	public UserVo() {
		super();
	}
	public UserVo(int id, String dname, String name, String pass, String sex, int age, String tel, String card,
			String address) {
		super();
		this.id = id;
		this.dname = dname;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
	}
	public UserVo(int id,  String dname, String name, String sex, int age, String tel, String card,
			String address) {
		super();
		this.id = id;
		
		this.dname = dname;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
	}
	
	
}
