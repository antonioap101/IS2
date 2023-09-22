package Kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person{
    private String name;
    private Calendar birthDate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public long milliSecondsToYear(long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(
                        today.getTimeInMillis()-birthDate.getTimeInMillis()));
    }
}