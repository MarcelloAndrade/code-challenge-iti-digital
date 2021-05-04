package br.com.iti.credential.validate.steps;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CredentialValidateNineOrMoreCharactersTest {
	
	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateNineOrMoreCharacters().execute("AbTp9!fok"));
		assertTrue(new CredentialValidateNineOrMoreCharacters().execute("AbTp9!fok1"));
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateNineOrMoreCharacters().execute("AbTp9!fo"));
	}

}
