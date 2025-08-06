package com.nt.config;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.nt.helper.PhoneNumber;

@Component
public class PhoneNumberFormater implements Formatter<PhoneNumber> {

	@Override
	public String print(PhoneNumber object, Locale locale) {
		return object.getCountryCode() + "-" + object.getNumber();
	}

	@Override
	public PhoneNumber parse(String text, Locale locale) throws ParseException {
//		countrycode-number
		String[] split = text.split("-");
		System.out.println(Arrays.toString(split));
		PhoneNumber number = new PhoneNumber();
		number.setCountryCode(Integer.parseInt(split[0]));
		number.setNumber(Long.parseLong(split[1]));
		return number;
	}

}
