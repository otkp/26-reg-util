package org.epragati.util;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author pbattula
 *
 */
public enum RoleEnum {

	CCO("CCO", 1), MVI("MVI", 1), AO("AO", 2), RTO("RTO", 3), FINANCE("FINANCE", 10), DEALER("DEALER", 11),
	CITIZEN("CITIZEN", 12), NICADMIN("NICADMIN", 13), ADMIN("ADMIN", 14), DTCIT("DTCIT", 15),DTC("DTC", 16),AOSTA("AOSTA", 17),SECRETARYRTO("SECRETARYRTO", 18),
	DRIVINGSCHOOL("DRIVINGSCHOOL",19),
	TC("TC",20),STA("STA",21), MDO("MDO",22);

	RoleEnum(String name, Integer index) {
		this.name = name;
		this.index = index;
	}

	private String name;
	private Integer index;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public static RoleEnum getRoleEnumByName(String name) {
		if (name == null) {
			return null;
		}
		return Arrays.stream(RoleEnum.values()).filter(r -> r.getName().equals(name)).findAny().orElse(null);
	}

	public enum UserLevel {
		USER0(0), USER1(1), USER2(2);
		private int level;

		private UserLevel(Integer level) {
			this.level = level;
		}

		/**
		 * @return the level
		 */
		public int getLevel() {
			return level;
		}

		/**
		 * @param level the level to set
		 */
		public void setLevel(int level) {
			this.level = level;
		}

	}

	public static List<String> getOfficersOnly() {
		return Arrays.asList(CCO.getName(), MVI.getName(), AO.getName(), RTO.getName(),ADMIN.getName(),DTCIT.getName(),DTC.getName(),AOSTA.getName(),SECRETARYRTO.getName(), MDO.getName());
	}

	
	public static List<String> getOfficersForNonPayment() {
		return Arrays.asList(CCO.getName(), MVI.getName(), AO.getName(), RTO.getName(),ADMIN.getName(),DTCIT.getName(),DTC.getName(),TC.getName(),STA.getName());
	}
	public static List<String> roleList() {
		return Arrays.asList(CCO.getName(), MVI.getName(), AO.getName(), RTO.getName());
	}
}
