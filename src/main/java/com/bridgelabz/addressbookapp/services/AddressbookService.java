package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressbookDTO;
import com.bridgelabz.addressbookapp.model.AddressbookData;

@Service
public class AddressbookService implements IAddressbookService {

	List<AddressbookData> addressbookDataList = new ArrayList<>();

	@Override
	public List<AddressbookData> getAddressbookData() {
		return addressbookDataList;
	}

	@Override
	public AddressbookData getAddressbookDataById(int personId) {
		AddressbookData addressbookData = null;
		addressbookData = addressbookDataList.get(personId - 1);
		return addressbookData;
	}

	@Override
	public AddressbookData createAddressbooData(AddressbookDTO addressbookDTO) {
		AddressbookData addressbookData = null;
		addressbookData = new AddressbookData(addressbookDataList.size() + 1, addressbookDTO);
		addressbookDataList.add(addressbookData);
		return addressbookData;
	}

	@Override
	public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
		AddressbookData addressbookData = this.getAddressbookDataById(personId);
		addressbookData.setName(addressbookDTO.name);
		addressbookData.setPhNumber(addressbookDTO.phNumber);
		addressbookDataList.set(personId - 1, addressbookData);
		return addressbookData;
	}

	@Override
	public void deleteAddressbooData(int personId) {
		int i = 1;
		addressbookDataList.remove(personId - 1);
		for (AddressbookData addressbookData : addressbookDataList) {
			addressbookData.setPersonId(i++);
		}
	}
}