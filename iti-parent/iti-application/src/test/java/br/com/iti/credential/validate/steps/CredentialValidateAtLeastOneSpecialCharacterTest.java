package br.com.iti.credential.validate.steps;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CredentialValidateAtLeastOneSpecialCharacterTest {
	
	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9!fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9@fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9#fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9$fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9%fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9^fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9&fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9*fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9(fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9)fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9+fok"));
		assertTrue(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9-fok"));
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateAtLeastOneSpecialCharacter().execute("AbTp9fok"));
	}

}
