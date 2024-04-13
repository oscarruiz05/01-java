package com.oscar;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String numberPhone;

    User(String name, String email){
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        if(numberPhone.length() == 10){
            this.numberPhone = numberPhone;
        }else{
            System.out.println("The number must be 10 digits ");
        }

    }

    @Override
    public String toString() {
        return "Name: "+name+"\nEmail: "+email;
    }
}
