package br.com.iti.credential.validate.steps;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CredentialValidateWhiteCharacterTest {
	
	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateWhiteCharacter().execute("AbTp9!fok"));
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateWhiteCharacter().execute("AbTp9!fok "));
		assertFalse(new CredentialValidateWhiteCharacter().execute("AbTp 9!fok"));
		assertFalse(new CredentialValidateWhiteCharacter().execute(" AbTp9!fok"));
		assertFalse(new CredentialValidateWhiteCharacter().execute(" "));
	}

}
