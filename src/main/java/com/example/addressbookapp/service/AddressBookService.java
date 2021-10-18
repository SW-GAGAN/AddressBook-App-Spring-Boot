package com.example.addressbookapp.service;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.model.Contact;

import java.util.List;

public interface AddressBookService {

    List<AddressBookDTO> getAddressBook();

    AddressBookDTO addAddressBook(AddressBookDTO addressBookDTO);

    AddressBookDTO updateAddressBook(int id, AddressBookDTO addressBookDTO);

    List<Contact> getContacts();

    Contact getContacts(long contactId);

    Contact addContact(Contact contact);

    Contact addAddressBook(Contact contact);

    Contact updateContact(Contact contact);
}




