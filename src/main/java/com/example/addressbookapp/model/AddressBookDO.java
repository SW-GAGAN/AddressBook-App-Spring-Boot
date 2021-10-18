package com.example.addressbookapp.model;

public class AddressBookDO {
    private int id;
    private String name;
    private String address;
    private String city;
    private String phone_number;
    private int zip;

    public AddressBookDO(int id, String name, String address, String city, String phone_number, int zip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.phone_number = phone_number;
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "AddressBookDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", zip=" + zip +
                '}';
    }
}
