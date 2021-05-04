package br.com.iti.credential.application;

import br.com.iti.credential.domain.Credential;
import br.com.iti.credential.domain.CredentialResponse;
import br.com.iti.credential.domain.service.CredentialValidate;
import br.com.iti.credential.validate.steps.CredentialValidateAtLeastOneDigit;
import br.com.iti.credential.validate.steps.CredentialValidateAtLeastOneLowercaseLetter;
import br.com.iti.credential.validate.steps.CredentialValidateAtLeastOneSpecialCharacter;
import br.com.iti.credential.validate.steps.CredentialValidateAtLeastOneUppercaseLetter;
import br.com.iti.credential.validate.steps.CredentialValidateNineOrMoreCharacters;
import br.com.iti.credential.validate.steps.CredentialValidateNotHaveRepeatedCharacters;
import br.com.iti.credential.validate.steps.CredentialValidateWhiteCharacter;

public class CredentialValidateImpl implements CredentialValidate {
	
	@Override
	public CredentialResponse isValid(Credential credential) {
		Boolean valid = new CredentialValidateNineOrMoreCharacters().execute(credential.getPassword()) &&
				   		new CredentialValidateNotHaveRepeatedCharacters().execute(credential.getPassword()) &&
				   		new CredentialValidateAtLeastOneLowercaseLetter().execute(credential.getPassword()) &&
				   		new CredentialValidateAtLeastOneUppercaseLetter().execute(credential.getPassword()) &&
				   		new CredentialValidateAtLeastOneSpecialCharacter().execute(credential.getPassword()) &&
				   		new CredentialValidateAtLeastOneDigit().execute(credential.getPassword()) &&
				   		new CredentialValidateWhiteCharacter().execute(credential.getPassword());
		return new CredentialResponse(credential.getPassword(), valid);
	}
}
