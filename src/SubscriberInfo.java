import java.time.LocalDate;

public class SubscriberInfo {

    private String fullName;
    private LocalDate birthDate;
    private Sex sex;
    private int id;

    public Adopter adopter;

    public SubscriberInfo(User user,Adopter adopter){
        setAdopter(adopter);
        fullName = this.adopter.requestInfoFullname(user);
        birthDate = this.adopter.getBithDate(user);
        sex = this.adopter.getSex(user);
        id = this.adopter.getId(user);
    }

    public void setAdopter(Adopter adopter){
        this.adopter = adopter;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return ("fullname is " + fullName + "\nbirthDate is : " +  birthDate + "\nsex is " + sex.name() + "\nid is : "  + id + "\n");
    }

}
