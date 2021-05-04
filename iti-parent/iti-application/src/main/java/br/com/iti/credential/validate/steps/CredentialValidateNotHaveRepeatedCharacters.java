package br.com.iti.credential.validate.steps;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Não possuir caracteres repetidos
 * 
 * @author mhfa
 */
public class CredentialValidateNotHaveRepeatedCharacters implements CredentialValidateSteps {

	@Override
	public boolean execute(String password) {
		// return !Pattern.compile("([a-zA-Z])\\1{1}").matcher(password).find();
		IntStream intStream = password.chars();
		Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);
		Map<Character, Long> groupingByChar = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

		return !groupingByChar.entrySet().stream().filter(o -> o.getValue().intValue() > 1).findAny().isPresent();
	}

}
