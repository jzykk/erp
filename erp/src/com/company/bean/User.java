package com.company.bean;

import java.sql.Date;

/**
 * @author yd
 * @category 员工表
 *
 */
public class User {
	/**
	 * 员工编号
	 */
	private int id;
	/**
	 * 职务编号
	 */
	private int did;
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
	private Date inputdate;
	/**
	 * 图片地址
	 */
	private String picture;

	public User(int id, int did, String name, String pass, String sex, int age, String tel, String card, String address,
			Date inputdate) {
		super();
		this.id = id;
		this.did = did;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
		this.inputdate = inputdate;
	}

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

	public Date getInputdate() {
		return inputdate;
	}

	public void setInputdate(Date inputdate) {
		this.inputdate = inputdate;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public User(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public User() {
		super();
	}

	public User(int id, int did, String name, String pass, String sex, int age, String tel, String card, String address,
			Date inputdate, String picture) {
		super();
		this.id = id;
		this.did = did;
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

	public User(int did, String name, String pass, String sex, int age, String tel, String card, String address,
			Date inputdate) {
		super();
		this.did = did;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
		this.inputdate = inputdate;
	}

	public User(int id, int did, String name, String pass) {
		super();
		this.id = id;
		this.did = did;
		this.name = name;
		this.pass = pass;
	}

	public User(int did, String name, String pass, String sex, int age, String tel, String card, String address) {
		super();
		this.did = did;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
	}

	public User(int id, int did, String name, String pass, String sex, int age, String tel, String card,
			String address) {
		super();
		this.id = id;
		this.did = did;
		this.name = name;
		this.pass = pass;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.card = card;
		this.address = address;
	}

}
