package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    boolean is;
    String gozRengi;
    String boy;
    public Person(String firstName,String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName,String lastName, int age,boolean is, String gozRengi,String boy) {
        this(firstName, lastName, age);
        this.is = is;
        this.gozRengi = gozRengi;
        this.boy = boy;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

}
