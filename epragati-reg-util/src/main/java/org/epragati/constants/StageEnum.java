package org.epragati.constants;

public enum StageEnum {

	ONE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5);
	Integer number;
	private StageEnum(Integer number) {
		this.number = number;
	}
	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}
	
}
