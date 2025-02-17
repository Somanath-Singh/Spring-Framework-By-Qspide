package com.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class DBDetails {

	private String url;

	private String userName;

	private String password;

	// constructor injection
	@Autowired
	public DBDetails(@Value("${db1.url}") String url, @Value("${db1.userName}") String userName,
			@Value("${db1.password}") String password) {

		System.out.println("DBDetails.DBDetails() - constructor Injection");
		this.url = url;
		this.userName = userName;
		this.password = password;

	}
	
	//setter injection

	@Autowired
	public void setUrl(@Value("${db2.url}") String url) {
		System.out.println("DBDetails.setUrl() - setter Injection");
		this.url = url;
	}

	@Autowired
	public void setUserName(@Value("${db2.userName}") String userName) {
		System.out.println("DBDetails.setUserName() - setter Injection");
		this.userName = userName;
	}

	@Autowired
	public void setPassword(@Value("${db2.password}") String password) {
		System.out.println("DBDetails.setPassword() - setter Injection");
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	
	//field injection
	@Autowired
	public void connectDataBase(@Value("${db3.url}") String url, @Value("${db3.userName}") String userName,
			@Value("${db3.password}") String password) {
		
		System.out.println("DBDetails.connectDataBase() - field injection");
		this.url = url;
		this.userName = userName;
		this.password = password;
		
	}

}
