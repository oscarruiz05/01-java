package com.oscar;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Oscar", "oscar@oscar.com");
        System.out.println(patient);

        Doctor doctor = new Doctor("Oscar", "oscar@oscar.com");
        System.out.println(doctor);
    }
}
