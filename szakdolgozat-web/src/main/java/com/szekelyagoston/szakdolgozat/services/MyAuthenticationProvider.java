package com.szekelyagoston.szakdolgozat.services;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		System.out.println("aaaddassad");
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(
		          MyAuthenticationToken.class);
	}

}
