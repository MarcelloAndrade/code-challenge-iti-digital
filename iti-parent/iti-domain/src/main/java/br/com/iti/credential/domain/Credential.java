package br.com.iti.credential.domain;

public class Credential {

	private String password;
	
	public Credential() {
		super();
	}

	public Credential(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
