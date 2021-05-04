package br.com.iti.credential.validate.steps;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CredentialValidateAtLeastOneLowercaseLetterTest {
	
	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateAtLeastOneLowercaseLetter().execute("AbTp9!fok"));
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateAtLeastOneLowercaseLetter().execute("ABTP9!FOK"));
	}

}
