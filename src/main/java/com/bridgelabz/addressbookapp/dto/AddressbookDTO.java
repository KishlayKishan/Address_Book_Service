package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

@Data
public class AddressbookDTO {
	public String name;
	public String phNumber;

	public AddressbookDTO(String name, String phNumber) {
		this.name = name;
		this.phNumber = phNumber;
	}

	@Override
	public String toString() {
		return "AddressbookDTO{" + "name='" + name + '\'' + ", phNumber=" + phNumber + '}';
	}
}