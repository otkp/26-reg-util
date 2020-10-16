package org.epragati.util.payment;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public enum FinanceTowEnum {
	CONTINUEWITHFINANCE(1, "ContinueWithSameFinancier"), TERMINATE(2, "Teriminate"),NEWFINANCE(3,"New Finance"),SELLERACCEPTED(4,"Seller Accepted"),SELLERREJECTED(5,"Seller Rejected"),ONLINE(6,"Online"),OFFLINE(7,"Offline");

	private Integer id;
	private String code;

	private FinanceTowEnum(Integer id, String code) {
		this.id = id;
		this.code = code;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	public static FinanceTowEnum getFinanceTowEnumById(Integer id) {

		if (id == null) {
			return null;
		}

		return Arrays.stream(FinanceTowEnum.values()).filter(financeTowEnum -> financeTowEnum.getId().equals(id)).findAny()
				.orElse(null);
	}

	public static FinanceTowEnum getFinanceTowEnum(String code) {

		if (StringUtils.isNoneBlank(code)) {
			return null;
		}

		return Arrays.stream(FinanceTowEnum.values()).filter(financeTowEnum -> financeTowEnum.getCode().equalsIgnoreCase(code))
				.findAny().orElse(null);

	}
}
