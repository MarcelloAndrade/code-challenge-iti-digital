package br.com.iti.credential.validate.steps;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CredentialValidateAtLeastOneDigitTest {

	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateAtLeastOneDigit().execute("AbTp9!fok"));
		assertTrue(new CredentialValidateAtLeastOneDigit().execute("9A153819Adas"));
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateAtLeastOneDigit().execute("AbTp!fok"));
	}
}
