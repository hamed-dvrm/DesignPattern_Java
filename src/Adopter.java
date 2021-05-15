import java.time.LocalDate;
import java.util.Set;

public class Adopter {

    public String requestInfoFullname(User user){
        PersonalInformation temp = user.getpInfo();
        String fullName = temp.name + " " + temp.lastName;
        return fullName;

    }

    public Sex getSex(User user){
        PersonalInformation temp = user.getpInfo();
        if (temp.sex.equals("male") ){
            return Sex.Male;
        }
        else if (temp.sex.equals("female")){
            return Sex.Female;
        }
        else
            return Sex.Other;
    }

    public int getId(User user){
        return user.getId();
    }

    public LocalDate getBithDate(User user){
        PersonalInformation temp = user.getpInfo();
        return (temp.birthDate);
    }
}
