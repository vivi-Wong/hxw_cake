package com.ace.turtle.common.enums;
/**
 * 性别类型枚举
 * @author Administrator
 *
 */
public enum SexEnum {
	/**
	 * 男
	 */
	MALE(0,"男"),
	/**
	 * 女
	 */
	FEMALE(1,"女");
	/**
	 * 枚举码
	 */
	private Integer code;
	/**
	 * 描述信息
	 */
	private String desc;
	
	private SexEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static SexEnum getEnum(Integer code) {

		for (SexEnum type : SexEnum.values()) {
			if (type.getCode()==code) {
				return type;
			}
		}
		return null;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
