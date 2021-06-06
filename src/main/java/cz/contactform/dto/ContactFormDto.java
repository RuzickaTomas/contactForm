package cz.contactform.dto;

import java.io.Serializable;

import cz.contactform.enumeration.KindOfRequest;

public class ContactFormDto implements Serializable {

	public KindOfRequest kindOfRequest;
	public String policyNumber;
	public String name;
	public String surname;
	public String request;
	

	public KindOfRequest getKindOfRequest() {
		return kindOfRequest;
	}
	public void setKindOfRequest(KindOfRequest kindOfRequest) {
		this.kindOfRequest = kindOfRequest;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kindOfRequest == null) ? 0 : kindOfRequest.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((policyNumber == null) ? 0 : policyNumber.hashCode());
		result = prime * result + ((request == null) ? 0 : request.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactFormDto other = (ContactFormDto) obj;
		if (kindOfRequest != other.kindOfRequest)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (policyNumber == null) {
			if (other.policyNumber != null)
				return false;
		} else if (!policyNumber.equals(other.policyNumber))
			return false;
		if (request == null) {
			if (other.request != null)
				return false;
		} else if (!request.equals(other.request))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ContactFormDto [kindOfRequest=" + kindOfRequest + ", policyNumber=" + policyNumber + ", name=" + name
				+ ", surname=" + surname + ", request=" + request + "]";
	}
	
	
	
	
	
}
