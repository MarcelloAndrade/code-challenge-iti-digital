package br.com.iti.credential.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.iti.credential.domain.Credential;
import br.com.iti.credential.domain.CredentialResponse;
import br.com.iti.credential.domain.service.CredentialValidate;

@ExtendWith(MockitoExtension.class)
public class CredentialControllerTest {
	
	@InjectMocks
	private CredentialController controller;

	@Mock
	private CredentialValidate credentialValidate;
	
	@Test
	void testIsValid() {
		Mockito.when(credentialValidate.isValid(Mockito.any(Credential.class))).thenReturn(new CredentialResponse("AbTp9!fok", Boolean.TRUE));
		CredentialResponse response = controller.isValid(new Credential("any"));
		assertTrue(response.getIsValid());
	}
	
	@Test
	void testIsInValid() {
		Mockito.when(credentialValidate.isValid(Mockito.any(Credential.class))).thenReturn(new CredentialResponse("AbTp9!fokA", Boolean.FALSE));
		CredentialResponse response = controller.isValid(new Credential("any"));
		assertFalse(response.getIsValid());
	}
}
