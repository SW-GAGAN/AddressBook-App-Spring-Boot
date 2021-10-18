package com.example.addressbookapp.controller;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.model.Contact;
import com.example.addressbookapp.service.AddressBookService;
import com.example.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressBookController {

    @Autowired
    private IAddressBookService iAddressBookService;


    @GetMapping(value = "/addresses")
    public ResponseEntity<List<AddressBookDTO>> getAddresses() {
        return new ResponseEntity<>(iAddressBookService.getAddressBook(), HttpStatus.OK);
    }

    @PostMapping(value = "/address")
    public ResponseEntity<AddressBookDTO> addAddressBook(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<>(iAddressBookService.addAddressBook(addressBookDTO), HttpStatus.CREATED);
    }

    @PutMapping(value = "/address")
    public ResponseEntity<AddressBookDTO> updateAddressBook(@RequestParam(name = "id") final int id, @RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<>(iAddressBookService.updateAddressBook(id, addressBookDTO), HttpStatus.OK);
    }
}
