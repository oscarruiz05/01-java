package com.oscar;

public class Doctor extends User{
    private String specility;

    Doctor(String name, String email){
        super(name, email);
    }

    public String getSpecility() {
        return specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }

    @Override
    public String toString() {
        return "\n\nDoctor\n"+super.toString() + "\nSpeciality: "+specility;
    }
}
