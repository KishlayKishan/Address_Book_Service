package com.bridgelabz.addressbookapp.dto;

public class AddressbookDTO {
	public String name;
	public long phNumber;

	public AddressbookDTO(String name, long phNumber) {
		this.name = name;
		this.phNumber = phNumber;
	}

	@Override
	public String toString() {
		return "AddressbookDTO{" + "name='" + name + '\'' + ", phNumber=" + phNumber + '}';
	}
}