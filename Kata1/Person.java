package Kata1;

import java.util.Date;

public class Person{
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return (int) ((new Date().getTime() - birthDate.getTime())/31536000000L);
    }
}