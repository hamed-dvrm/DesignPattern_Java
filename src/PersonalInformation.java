import java.time.LocalDate;

public class PersonalInformation {

    public String name;
    public String lastName;
    public LocalDate birthDate;
    public String sex;

    public PersonalInformation (String name,String lastName, LocalDate birthDate , String sex){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String toString(){
        return ("firstName : " + name + "\nlastName is : " + lastName  +  "\nbirthdate : " + birthDate + "\nsex : "  + sex);
    }


}
