package com.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAnnotationBased {

	int id;

	public int getId() {
		return id;
	}

	//setter injection
	@Autowired
	public void setId(@Value("1") int id) {
		System.out.println("EmployeeAnnotationBased.setId() - setter injection");
		this.id = id;
	}

	@PostConstruct
	public void springstart() {
		System.out.println("Employee.spring - start()");
	}

	@PreDestroy
	public void springstop() {
		System.out.println("Employee.spring - stop()");
	}

	@Override
	public String toString() {
		return "Test [id=" + id + "]";
	}

}
