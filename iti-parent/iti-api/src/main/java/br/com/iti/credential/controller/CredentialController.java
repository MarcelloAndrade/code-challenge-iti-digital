package br.com.iti.credential.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.iti.credential.application.CredentialValidateImpl;
import br.com.iti.credential.domain.Credential;
import br.com.iti.credential.domain.CredentialResponse;
import br.com.iti.credential.domain.service.CredentialValidate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Credential validate", description = " ")
public class CredentialController {

    private CredentialValidate credentialValidate;
    
    public CredentialController() {
		this.credentialValidate = new CredentialValidateImpl();
	}
    
    @ApiOperation(value = "Validate a password.")
    @PostMapping(path = "/credential")
    @ResponseStatus(HttpStatus.OK)
    public CredentialResponse isValid(@RequestBody Credential request) {
        return this.credentialValidate.isValid(request);
    }
}
