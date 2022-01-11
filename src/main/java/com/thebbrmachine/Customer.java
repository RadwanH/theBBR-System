package com.thebbrmachine;

public class Customer {
    private String firstName;
    private String lastName;
    private String phone;
    private String id;


    public Customer(String firstName, String lastName, String phone, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
