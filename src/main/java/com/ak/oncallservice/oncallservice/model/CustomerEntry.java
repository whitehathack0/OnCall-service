package com.ak.oncallservice.oncallservice.model;

public class CustomerEntry {
    private int id;
    private String name;
    private String address1;
    private String address2;
    private String zipcode;
    private String phone;
    private String email;
    private String description;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zip) {
        this.zipcode = zip;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String num) {
        this.phone = num;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String em) {
        this.email= em;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }
}
