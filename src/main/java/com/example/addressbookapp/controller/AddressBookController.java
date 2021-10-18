package com.example.addressbookapp.controller;

import com.example.addressbookapp.model.Contact;
import com.example.addressbookapp.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to AddressBook Application";
    }

    /**
     * Get the Contacts added in the List
     *
     * @return Contacts
     */
    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return this.addressBookService.getContacts();
    }

    /**
     * Get particular contact using ContactId
     *
     * @param contactId
     * @return Contacts
     */
    @GetMapping("/contacts/{contactId}")
    public Contact getContacts(@PathVariable long contactId) {
        return this.addressBookService.getContacts(contactId);

    }

    /**
     * Add the contacts in to the Contact list
     *
     * @param contact
     * @return
     */
    @PostMapping(path = "/contacts", consumes = "application/json")
    public Contact addContact(@RequestBody Contact contact) {
        return this.addressBookService.addContact(contact);
    }

    /**
     * Update the Contacts using Post Request
     *
     * @param contact
     * @return
     */
    @PutMapping("/update")
    public Contact updateContact(@RequestBody Contact contact) {
        return this.addressBookService.updateContact(contact);
    }

}

