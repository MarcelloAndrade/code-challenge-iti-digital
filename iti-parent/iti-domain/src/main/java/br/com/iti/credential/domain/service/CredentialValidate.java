package br.com.iti.credential.domain.service;

import br.com.iti.credential.domain.Credential;
import br.com.iti.credential.domain.CredentialResponse;

public interface CredentialValidate {
	
	public CredentialResponse isValid(Credential credential);

}
