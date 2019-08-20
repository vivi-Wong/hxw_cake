package com.ace.turtle.common.enums;
/**
 * 课程类型枚举
 * @author Administrator
 *
 */
public enum CourseEnum {
	/**
	 * 语文
	 */
	Chinese(1,"语文"),
	/**
	 * 数学
	 */
	FEMALE(2,"数学"),
	/**
	 * 英语
	 */
	EBNGLISH(3,"英语")
	;
	/**
	 * 枚举码
	 */
	private Integer code;
	/**
	 * 描述信息
	 */
	private String desc;
	
	private CourseEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static CourseEnum getEnum(Integer code) {

		for (CourseEnum type : CourseEnum.values()) {
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
