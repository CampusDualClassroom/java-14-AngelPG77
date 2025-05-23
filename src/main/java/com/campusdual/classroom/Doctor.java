package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	@Override
	public void getDetails() {
		System.out.println("La persona cuyo nombre es: " + super.name + " de apellido " + super.surname + " y su especializacion es: " + this.specialization);
	}
}
