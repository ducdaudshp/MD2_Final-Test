package model;

import java.io.Serializable;
import java.time.LocalDate;

public class ListBook implements Serializable {
    private String phone;
    private String group;
    private String name;
    private String gender;
    private String address;
    private LocalDate dateOfBrith;
    private String email;

    public ListBook() {
    }

    public ListBook(String phone, String group, String name, String gender, String address, LocalDate dateOfBrith, String email) {
        this.phone = phone;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBrith = dateOfBrith;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void setDateOfBrith(int year, int month, int day) {
//        this.dateOfBrith = LocalDate.of(year, month, day);
//    }

    @Override
    public String toString() {
        return "ListBook{" +
                "phone='" + phone + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBrith='" + dateOfBrith + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
