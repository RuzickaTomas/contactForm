package cz.contactform.enumeration;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum KindOfRequest {
	
	@JsonProperty("Contact Adjustment")
	CONTACT_ADJ("Contact Adjustment"),
	@JsonProperty("Damage Case")
	DMG_CASE("Damage Case"),
	@JsonProperty("Complaint")
	COMPLAINT("Complaint");
	
	private String value;
	
	KindOfRequest(String value) {
		this.value = value;
	}
	
	public String getLabel() {
		return this.value;
	}

}
