package br.com.iti.credential.application;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.iti.credential.domain.Credential;

public class CredentialValidateImplTest {
	
	@Test
	void testIsValid() {
		assertTrue(new CredentialValidateImpl().isValid(new Credential("AbTp9!fok")).getIsValid());
	}
	
	@Test
	void testIsInValid() {
		assertFalse(new CredentialValidateImpl().isValid(new Credential("")).getIsValid());
		assertFalse(new CredentialValidateImpl().isValid(new Credential("aa")).getIsValid());
		assertFalse(new CredentialValidateImpl().isValid(new Credential("ab")).getIsValid());
		assertFalse(new CredentialValidateImpl().isValid(new Credential("AAAbbbCc")).getIsValid());
		assertFalse(new CredentialValidateImpl().isValid(new Credential("AbTp9!foo")).getIsValid());
		assertFalse(new CredentialValidateImpl().isValid(new Credential("AbTp9!foA")).getIsValid());
		assertFalse(new CredentialValidateImpl().isValid(new Credential("AbTp9 fok")).getIsValid());
		assertFalse(new CredentialValidateImpl().isValid(new Credential("AbTp9!fok ")).getIsValid());
	}

}
