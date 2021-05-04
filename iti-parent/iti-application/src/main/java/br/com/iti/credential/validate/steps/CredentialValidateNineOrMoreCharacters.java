package br.com.iti.credential.validate.steps;

import java.util.regex.Pattern;

/**
 * Nove ou mais caracteres
 * @author mhfa
 */
public class CredentialValidateNineOrMoreCharacters implements CredentialValidateSteps {

	@Override
	public boolean execute(String password) {
		return Pattern.compile(".{9}").matcher(password).find();
	}
	
}
