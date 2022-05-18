package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.model.AddressbookData;

@Service
public class AddressbooService implements IAddressbookService {
	@Override
	public List<AddressbookData> getAddressbookData() {
		List<AddressbookData> addressbookDataList = new ArrayList<>();
		addressbookDataList.add(new AddressbookData(1, new AddressbookDTO("karthik", "7411949218")));
		return addressbookDataList;
	}

	@Override
	public AddressbookData getAddressbookDataById(int personId) {
		AddressbookData addressbookData = null;
		addressbookData = new AddressbookData(personId, new AddressbookDTO("karthik", "12345678"));
		return addressbookData;
	}

	@Override
	public AddressbookData createAddressbooData(AddressbookDTO addressbookDTO) {
		AddressbookData addressbookData = null;
		addressbookData = new AddressbookData(1, addressbookDTO);
		return addressbookData;
	}

	@Override
	public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
		AddressbookData addressbookData = null;
		addressbookData = new AddressbookData(personId, addressbookDTO);
		return addressbookData;
	}

	@Override
	public void deleteAddressbooData(int personId) {

	}
}