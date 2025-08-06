package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Mid;
	private String paper1;
	private int mark1;
	private String paper2;
	private int mark2;
	private String paper3;
	private int mark3;
	private String paper4;
	private int mark4;
	private String pratical;
	private int mark5;
	@ManyToOne
	@JoinColumn(name = "Sid")
	private Student student;

}
