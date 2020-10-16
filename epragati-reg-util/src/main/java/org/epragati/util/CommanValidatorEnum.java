package org.epragati.util;

public enum CommanValidatorEnum {
   PRNOMIN(1,"PRNOMIN",3),PRNOMAX(2,"PRNOMAX",11),PRNOSUBMIN(3,"PRNOMIN",4);
	
		private Integer id;
		private String description;
		private Integer length;
		private CommanValidatorEnum(Integer id, String description, Integer length) {
			this.id = id;
			this.description = description;
			this.length = length;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Integer getLength() {
			return length;
		}
		public void setLength(Integer length) {
			this.length = length;
		}
		
		
}
