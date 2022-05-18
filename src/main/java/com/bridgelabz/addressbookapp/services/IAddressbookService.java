package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.model.AddressbookData;

public interface IAddressbookService {
	List<AddressbookData> getAddressbookData();

	AddressbookData getAddressbookDataById(int personId);

	AddressbookData createAddressbooData(AddressbookDTO addressbookDTO);

	AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO);

	void deleteAddressbooData(int personId);
}