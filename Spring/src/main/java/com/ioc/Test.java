package com.ioc;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
<<<<<<< HEAD
	
	int id;
	String name;
	
	
	
	
=======

	int id;
	String name;

>>>>>>> e1c4418 (commit the code)
	public int getId() {
		return id;
	}

<<<<<<< HEAD



=======
>>>>>>> e1c4418 (commit the code)
	public void setId(int id) {
		this.id = id;
	}

<<<<<<< HEAD



=======
>>>>>>> e1c4418 (commit the code)
	public String getName() {
		return name;
	}

<<<<<<< HEAD



=======
>>>>>>> e1c4418 (commit the code)
	public void setName(String name) {
		this.name = name;
	}

<<<<<<< HEAD



=======
>>>>>>> e1c4418 (commit the code)
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
<<<<<<< HEAD
	
=======
>>>>>>> e1c4418 (commit the code)

}
