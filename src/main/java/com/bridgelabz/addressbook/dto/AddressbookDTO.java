package com.bridgelabz.addressbook.dto;

import lombok.Data;

/**
 Use Of Lombak In Addressbook Annotations
 */
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
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", phNumber=" + phNumber +
                '}';
    }
}
