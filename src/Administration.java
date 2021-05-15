import java.util.ArrayList;

public class Administration {
    ArrayList<User> usersList = new ArrayList<>();
    ArrayList<MagazineSingleton> magazineList = new ArrayList<>();

    public User signIn(PersonalInformation p ){
        int id = usersList.size();
        User temp = new User(p,id);
        usersList.add(temp);
        return temp;

    }

    public void addMagazine(MagazineSingleton magazine){
        magazineList.add(magazine);
    }

    public void printAllMagazines(){
        for(MagazineSingleton tempMagazine : magazineList){
            tempMagazine.printMagazine();
        }
    }

    public void magazineCustomer(){
        for(MagazineSingleton magazine : magazineList){
            System.out.println("Number of Subscribers for " + magazine + "is :" + magazine.subscriberList.size());
        }
    }

    public User getUser(int id){
        for(User tempUser : usersList){
            if(tempUser.getId() == id){
                return tempUser;
            }
        }
        return null;
    }

    public void printSales(){}

    public void publishCosts(){}


}
