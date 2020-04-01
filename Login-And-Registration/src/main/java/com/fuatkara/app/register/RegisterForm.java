package com.fuatkara.app.register;

public class RegisterForm {
	private String name;
	private String surname;
	private String password;
	private String mail;
	
	public RegisterForm() {
		super();
	}

	public RegisterForm(String name, String surname, String password, String mail) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "RegisterForm [Name=" + name + ", Surname=" + surname + ", Password=" + password + ", Mail="
				+ mail + "]";
	}
}