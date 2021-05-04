package br.com.iti.credential.validate.steps;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CredentialValidateNotHaveRepeatedCharactersTest {
	
	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok"));
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!foA"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fokb"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok!"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok@@"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok##"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok$$"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok%%"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok^^"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok&&"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok**"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok(("));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok))"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok--"));
		assertFalse(new CredentialValidateNotHaveRepeatedCharacters().execute("AbTp9!fok++"));
	}

}
