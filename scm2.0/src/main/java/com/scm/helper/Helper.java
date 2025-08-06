package com.scm.helper;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class Helper {
	
	public static String getEmailOfLoggedInUser(Authentication authentication) {
		
		//AuthenticatedPrincipal principal=(AuthenticatedPrincipal)authentication.getPrincipal();
		
		
		if(authentication instanceof OAuth2AuthenticationToken) {
			
			var aOAuth2AuthenticationToken= (OAuth2AuthenticationToken)authentication;
			var clientId=aOAuth2AuthenticationToken.getAuthorizedClientRegistrationId();
			
			var oauth2User=(OAuth2User)authentication.getPrincipal();
			String userName="";
			
			
			if(clientId.equalsIgnoreCase("google")){
			
				//for sign in with google
				System.out.println("Getting Email from Google");
				userName=oauth2User.getAttribute("email").toString();
			}
			else if(clientId.equalsIgnoreCase("github")){	
				
				//for sign in with github
				System.out.println("Getting Email from Github");
				userName = oauth2User.getAttribute("eamil") != null ? oauth2User.getAttribute("email").toString()
						: oauth2User.getAttribute("login").toString() + "@gmail.com";
				
			}
			return userName;
		}
			
			else {
				//for manual login by using email and password
				System.out.println("Getting email from local Database");
				return authentication.getName();
			}

		
	}

}
