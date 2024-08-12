package com.example.loans.domain;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer age;
	
	private String cpf;
	
	private String name;
	
	private Integer income;
	
	private String location;
	
	public Client() {
	}

	public Client(Integer age, String cpf, String name, Integer income, String location) {
		super();
		this.age = age;
		this.cpf = cpf;
		this.name = name;
		this.income = income;
		this.location = location;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, cpf, income, location, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(age, other.age) && Objects.equals(cpf, other.cpf) && Objects.equals(income, other.income)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}
}
