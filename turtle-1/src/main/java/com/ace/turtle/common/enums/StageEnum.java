package com.ace.turtle.common.enums;
/**
 * 阶段类型枚举
 * @author Administrator
 *
 */
public enum StageEnum {
	/**
	 * 入学
	 */
	ENTRANCE(1,"入学"),
	/**
	 * 期中
	 */
	MID(2,"期中"),
	/**
	 * 期末
	 */
	END(3,"期末")
	;
	/**
	 * 枚举码
	 */
	private Integer code;
	/**
	 * 描述信息
	 */
	private String desc;
	
	private StageEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static StageEnum getEnum(Integer code) {

		for (StageEnum type : StageEnum.values()) {
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
