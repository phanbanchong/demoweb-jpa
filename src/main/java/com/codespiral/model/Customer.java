package com.codespiral.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	@Id
   	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name ="first_name") 
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name ="email")
    private String email;

    protected Customer() {}

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
        return String.format( "Customer[id=%d, firstName='%s', lastName='%s', email='%s']", id, firstName, lastName, email);
    }

}