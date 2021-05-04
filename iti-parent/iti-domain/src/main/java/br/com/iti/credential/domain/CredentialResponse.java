package br.com.iti.credential.domain;

public class CredentialResponse {

	private String password;
	private Boolean isValid;

	public CredentialResponse() {
		super();
	}

	public CredentialResponse(String password, Boolean isValid) {
		super();
		this.password = password;
		this.isValid = isValid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

}
