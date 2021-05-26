package Entity;

import java.util.Calendar;
import java.util.Date;

public class Gamer extends User{

    private String firstName;
    private String lasName;
    private String identityNumber;
    private int birthDate;

    public Gamer(){

    }
    
    public Gamer(int id, String email, String firstName, String lasName, String identityNumber, int birthDate) {
        super(id, email);
        this.firstName = firstName;
        this.lasName = lasName;
        this.identityNumber = identityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}
