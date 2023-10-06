package com.example.springboottoangular.dto;

import com.example.springboottoangular.entity.Client;
import com.example.springboottoangular.entity.Passport;

public class DtoClient {

    private String firstname;

    private String lastname;

    private String email;

    private String phoneNumber;

    private DtoClient.Passport passport;

    public static DtoClient createDto(Client client) {
        return new DtoClient();
    }

    public static class Passport {
        private String series;

        private String number;
    }

    /*public static class DtoClientGet {

    }

    public static class DtoClientCreate {
        private String firstname;

        private String lastname;

        private String email;

        private String phoneNumber;

        private Passport passport;

        public DtoClientCreate(String firstname, String lastname, String email, String phoneNumber, Passport passport) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.passport = passport;
        }


        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Passport getPassport() {
            return passport;
        }

        public void setPassport(Passport passport) {
            this.passport = passport;
        }
    }*/

}
