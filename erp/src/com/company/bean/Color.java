package com.company.bean;

/**
 * @author yd
 * @category 颜色类
 *
 */
public class Color {
	/**
	 * 颜色id
	 */
	private int colorId;
	/**
	 * 颜色
	 */
	private String color;
	public int getColorId() {
		return colorId;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Color(int colorId, String color) {
		super();
		this.colorId = colorId;
		this.color = color;
	}
	public Color() {
		super();
	}
	
	
}
