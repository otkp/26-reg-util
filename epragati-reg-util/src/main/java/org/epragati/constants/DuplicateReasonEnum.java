package org.epragati.constants;

public enum DuplicateReasonEnum {

		LOST("LOST"), TORNOUT("TORNOUT");
		private String name;

		public String getName() {
			return name;
		}

		DuplicateReasonEnum(final String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.getName();
		}
		
}
