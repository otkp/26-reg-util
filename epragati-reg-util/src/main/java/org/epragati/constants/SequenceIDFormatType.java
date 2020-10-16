package org.epragati.constants;

public enum SequenceIDFormatType {
	
	CONST("CONST"),
	OFFICE_CODE("OFFICE_CODE"),
	YEAR("YEAR"),
	CURRENT_NUM("CURRENT_NUM");
	
	private String type;
	
	SequenceIDFormatType(String type)
	{
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
} 
