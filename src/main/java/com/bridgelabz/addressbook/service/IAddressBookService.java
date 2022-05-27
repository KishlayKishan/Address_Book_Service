package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.model.AddressbookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressbookData> getAddressbookData();

    AddressbookData getAddressbookDataById(int personId);

    AddressbookData createAddressbookData(AddressbookDTO addressbookDTO);

    AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO);

    void deleteAddressbookData(int personId);
}