package br.com.iti.credential.validate.steps;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CredentialValidateAtLeastOneUppercaseLetterTest {
	
	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateAtLeastOneUppercaseLetter().execute("AbTp9!fok"));
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateAtLeastOneUppercaseLetter().execute("abtp9!fok"));
	}

}
