package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressbookData {
	private int personId;
	private String name;
	private String phNumber;

	public AddressbookData(int personId, AddressbookDTO addressbookDTO) {
		this.personId = personId;
		this.name = addressbookDTO.name;
		this.phNumber = addressbookDTO.phNumber;
	}
}