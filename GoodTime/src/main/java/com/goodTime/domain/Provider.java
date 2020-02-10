package com.goodTime.domain;

public class Provider {
	
	 	private int id;
	    private String providerName;
	    private String businessName;
	    private String email;
	    private String phoneNumber;
	    private String password;
	    
	    public Provider() {
	    	
	    }

		public Provider(int id, String providerName, String businessName, String email, String phoneNumber) {
			super();
			this.id = id;
			this.providerName = providerName;
			this.businessName = businessName;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProviderName() {
			return providerName;
		}

		public void setProviderName(String providerName) {
			this.providerName = providerName;
		}

		public String getBusinessName() {
			return businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    

}
