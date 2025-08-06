package com.aashdit.assosiation.mapping.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "AM_PHONENUMBERS_DETAILS")
@Getter
@Setter
public class PhoneNumber implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pnoid;

    private Long phoneNumber;

    @Column(length = 20)
    private String numberType;

    @Column(length = 20)
    private String provider;
    
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "phone_no_id", referencedColumnName = "pnoid") // Correct FK mapping
//	private List<Person> person;
    
    @ManyToOne
    @JoinColumn(name = "person_id") // FK column created here
    private Person person;

}

