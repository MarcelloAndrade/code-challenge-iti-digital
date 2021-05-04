package br.com.iti.credential.validate.steps;

import java.util.regex.Pattern;

/**
 * Ao menos 1 dígito
 * @author mhfa
 */
public class CredentialValidateWhiteCharacter implements CredentialValidateSteps {

	@Override
	public boolean execute(String password) {
		return !Pattern.compile("[ ]+").matcher(password).find();
	}
}