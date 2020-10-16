package org.epragati.constants;

import org.apache.commons.lang3.StringUtils;

public enum GenderEnum {
	MALE("MALE"), FEMALE("FEMALE"), NONE("NONE");
	private String name;

	public String getName() {
		return name;
	}

	GenderEnum(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName();
	}

	public static boolean isMale(GenderEnum value) {

		return GenderEnum.MALE.name.equals(value.name);
	}

	public static boolean isFemale(GenderEnum value) {

		return GenderEnum.FEMALE.name.equals(value.name);
	}

	public boolean isMale() {

		return GenderEnum.MALE.name.equals(name);
	}

	public boolean isFemale() {

		return GenderEnum.FEMALE.name.equals(name);
	}

	public static GenderEnum getGenderEnum(String value) {

		GenderEnum genderEnum = NONE;

		if (StringUtils.isBlank(value)) {
			return genderEnum;
		}

		return GenderEnum.FEMALE.name.equalsIgnoreCase(value) ? GenderEnum.FEMALE : GenderEnum.MALE;
	}
}
