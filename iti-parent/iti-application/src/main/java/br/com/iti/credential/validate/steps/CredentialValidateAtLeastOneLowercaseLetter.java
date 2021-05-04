package br.com.iti.credential.validate.steps;

import java.util.regex.Pattern;

/**
 * Ao menos uma letra minúscula
 * @author mhfa
 */
public class CredentialValidateAtLeastOneLowercaseLetter implements CredentialValidateSteps {

	@Override
	public boolean execute(String password) {
		return Pattern.compile("[a-z]").matcher(password).find();
	}

}
