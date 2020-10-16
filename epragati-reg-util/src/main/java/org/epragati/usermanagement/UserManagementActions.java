package org.epragati.usermanagement;

/*
 * @author Venkatesh dindi
 * 
 */
public enum UserManagementActions {
	USERPASSWORDRESET("USER PASSWORD RESET"), USERTRANSFER("USER TRANSFER"), USERUPDATE("USER UPDATE"),
	NEWUSERREGISTRATION("NEW USER REGISTRATION"), DISABLE("DISABLE USER "),ACTIVE("ACTIVE USER");

	UserManagementActions(String actionType) {
		this.actionType = actionType;
	}

	private String actionType;

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
