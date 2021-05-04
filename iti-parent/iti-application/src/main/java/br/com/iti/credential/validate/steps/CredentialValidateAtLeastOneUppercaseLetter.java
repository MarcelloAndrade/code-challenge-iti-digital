package br.com.iti.credential.validate.steps;

import java.util.regex.Pattern;

/**
 * Ao menos 1 letra maiúscula
 * @author mhfa
 */
public class CredentialValidateAtLeastOneUppercaseLetter implements CredentialValidateSteps {

	@Override
	public boolean execute(String password) {
		return Pattern.compile("[A-Z]").matcher(password).find();
	}
	
}
