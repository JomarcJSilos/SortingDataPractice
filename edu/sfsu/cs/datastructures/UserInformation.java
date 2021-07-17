package edu.sfsu.cs.datastructures;

public class UserInformation implements Comparable<UserInformation>{

    //Initializing each Data Member
    private String firstName, lastName, emailAddress, gender, city, state;
    private int age;

    //Getters for each Data Member
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    //Setters for each Data Member
    public void setFirstName(String first) {
        firstName = first;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public void setAge(int ageNum) {
        age = ageNum;
    }

    public void setEmailAddress(String email) {
        emailAddress = email;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setCity(String c) {
        city = c;
    }

    public void setState(String sT) {
        state = sT;
    }

    //Constructor for UserInformation
    public UserInformation() {
        firstName = "";
        lastName = "";
        age = 0;
        emailAddress = "";
        gender = "";
        city = "";
        state = "";
    }

    public UserInformation(String firstName, String lastName, String emailAddress, String gender, String city, String state, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.age = age;
    }

    //ToString Method
    @Override
    public String toString() {
        return "UserInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", email='" + emailAddress + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                '}';
    }

    @Override
    public int compareTo(UserInformation user1) {
        if (this.age > user1.getAge()){
            return -1;
        } else if (this.age == user1.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }
}
