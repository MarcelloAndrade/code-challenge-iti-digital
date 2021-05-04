package br.com.iti.credential.validate.steps;

import java.util.regex.Pattern;

/**
 * Ao menos 1 caractere especial
 * Considere como especial os seguintes caracteres: !@#$%^&*()+
 * @author mhfa
 */
public class CredentialValidateAtLeastOneSpecialCharacter implements CredentialValidateSteps {

	@Override
	public boolean execute(String password) {
		return Pattern.compile("[-!@#$%^&*()+]").matcher(password).find();
	}
	
}
