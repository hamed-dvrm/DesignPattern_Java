import javax.swing.plaf.IconUIResource;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String command = null;
        Administration administration = new Administration();

        while (true){
            System.out.println("Your command is : ");
            command = scanner.next();


            if (command.equals("/printinfo")){
                administration.printAllMagazines();


            }
            else if (command.equals("/createModel\"sport\"")){
                SportMagazineSingleton sportInstance = SportMagazineSingleton.getInstance();
                System.out.println("sport magazine created ");
                if (!administration.magazineList.contains(sportInstance)){
                    administration.addMagazine(sportInstance);
                }
            }
            else if (command.equals("/createModel\"political\"")){
                PoliticalMagazineSingleton politicalInstance = PoliticalMagazineSingleton.getInstance();
                System.out.println("political  magazine created ");
                if (!administration.magazineList.contains(politicalInstance)){
                    administration.addMagazine((politicalInstance));
                }
            }
            else if (command.equals("/createModel\"economical\"")){
                EconomicalMagazineSingleton economicalInstance = EconomicalMagazineSingleton.getInstance();
                System.out.println("economical magazine created ");
                if (!administration.magazineList.contains(economicalInstance)){
                    administration.addMagazine(economicalInstance);
                }
            }
            else if (command.equals("/createCharacter")){
                try {
                    String firstName;
                    String lastName;
                    LocalDate birthdate;
                    String sex;
                    System.out.print("firstName : ");
                    firstName = scanner.next();
                    System.out.println(firstName);
                    System.out.print("last name is :  ");
                    lastName = scanner.next();
                    System.out.println(lastName);
                    System.out.print("enter birthdate like (1955(year)-12(month)-08(day))");
                    birthdate = LocalDate.parse(scanner.next());
                    System.out.println(birthdate);
                    System.out.print("enter your sex (male/female) :");

                    sex = scanner.next();
                    while((!sex.equals("female"))  && (!sex.equals("male"))){
                        System.out.print("eneter sex correctly please");
                        sex = scanner.next();
                    }

                    System.out.println(sex);
                    PersonalInformation personalInformation = new PersonalInformation(firstName, lastName, birthdate, sex);
                    System.out.println(administration.signIn(personalInformation));
                }
                catch (Exception e){
                    System.out.println("There is a problem with the information you have added");
                }

            }


            else if (command.equals("/subscribe")){
                Adopter adopter = new Adopter();
                SubscriberInfo sInfo;
                User user;
                String magazineName;
                int id;
                System.out.print("MagazineName : ");
                magazineName = scanner.next();
                System.out.print("id : ");
                id = scanner.nextInt();
                if (administration.getUser(id)!= null){
                    user = administration.getUser(id);
                     sInfo = new SubscriberInfo(user,adopter);

                }
                else {
                    System.out.println("There is no user with that id in the system ");
                    continue;
                }

                Subscriber subscriber = new Subscriber(sInfo);
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().subscribe(subscriber);
                    SportMagazineSingleton.getInstance().printSubscribers();
                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().subscribe(subscriber);
                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().subscribe(subscriber);
                }
                else
                    System.out.println("no magazine with that name here friend");




            }
            else if (command.equals("/getEditingProgress")){
                String magazineName;
                System.out.print("Choose magazine from these items : sport / political / economical :  ");
                magazineName = scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().getEditingProgress();
                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().getEditingProgress();
                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().getEditingProgress();
                }
                else{
                    System.out.println("wrong choice");
                }
            }
            else if (command.equals("/startPrinting")){
                String magazineName;
                System.out.print("Magazine name : ");
                magazineName = scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().startPrinting();
                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().startPrinting();
                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().startPrinting();
                }
                else {
                    System.out.println("Wrong name ");
                }
            }
            else if (command.equals("/getPrintingProgress")){
                String magazineName;
                System.out.print("Enter magazine name :(economical/political/sport) " );
                magazineName = scanner.next();
                if(magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().getPrintingProgress();
                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().getPrintingProgress();
                }
                else if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().getPrintingProgress();
                }
                else {
                    System.out.println("wrong name ");
                }

            }
            else if (command.equals("/startPublishing")){
                String magazineName;
                System.out.println("Enter magazineName : (economical/political/sport");
                magazineName = scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().startPublishing();
                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().startPublishing();
                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().startPublishing();
                }
                else {
                    System.out.println("wrong name");
                }
            }
            else if (command.equals("/publish")){
                String magazineName;
                System.out.print("Enter magazine name : (economical/sport/political) ");
                magazineName = scanner.next();
                System.out.print("enter status :  ");
                String status;
                status =scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().publish(status);
                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().publish(status);
                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().publish(status);
                }
                else {
                    System.out.println("wrong state");
                }

            }
            else if (command.equals("/setPublishingMethod")){
                String magazineName;
                String sendStrategy;
                System.out.print("Enter magazineName : (sport/political/economical) ");
                magazineName = scanner.next();
                System.out.print("Enter sendStrategy : (courier / online ) ");
                sendStrategy = scanner.next();
                if (magazineName.equals("sport")){
                    if (sendStrategy.equals("courier")){
                        SportMagazineSingleton.getInstance().setStrat(new CourierStrategy());

                    }
                    else if (sendStrategy.equals("online")){
                        SportMagazineSingleton.getInstance().setStrat(new Online());

                    }
                    else {
                        System.out.println("wrong publishing method");
                    }
                }
                else if (magazineName.equals("political")){
                    if (sendStrategy.equals("courier")){
                        PoliticalMagazineSingleton.getInstance().setStrat(new CourierStrategy());

                    }
                    else if (sendStrategy.equals("online")){
                        PoliticalMagazineSingleton.getInstance().setStrat(new Online());

                    }
                    else {
                        System.out.println("wrong publishing method");
                    }
                }
                else if (magazineName.equals("economical")){
                    if (sendStrategy.equals("courier")){
                       EconomicalMagazineSingleton.getInstance().setStrat(new CourierStrategy());

                    }
                    else if (sendStrategy.equals("online")){
                        EconomicalMagazineSingleton.getInstance().setStrat(new Online());

                    }
                    else {
                        System.out.println("wrong publishing method");
                    }
                }

            }
            else if (command.equals("/addQ")){
                String magazineName;
                System.out.println("Enter magazineName :(political/economical/sport) ");
                magazineName = scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().addStyle(new Qstyle());

                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().addStyle(new Qstyle());

                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().addStyle(new Qstyle());

                }
                else {
                    System.out.println("wrong name");
                }
            }
            else if (command.equals("/addStar")){
                String magazineName;
                System.out.println("Enter magazineName :(political/economical/sport) ");
                magazineName = scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().addStyle(new starStyle());

                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().addStyle(new starStyle());

                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().addStyle(new starStyle());

                }
                else {
                    System.out.println("wrong name");
                }
            }
            else if (command.equals("/removeQ")){
                String magazineName;
                System.out.println("Enter magazineName :(political/economical/sport) ");
                magazineName = scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().removeStyle(new Qstyle());

                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().removeStyle(new Qstyle());

                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().removeStyle(new Qstyle());

                }
                else {
                    System.out.println("wrong name");
                }
            }
            else if (command.equals("/removeStar")){
                String magazineName;
                System.out.println("Enter magazineName :(political/economical/sport) ");
                magazineName = scanner.next();
                if (magazineName.equals("sport")){
                    SportMagazineSingleton.getInstance().removeStyle(new starStyle());

                }
                else if (magazineName.equals("political")){
                    PoliticalMagazineSingleton.getInstance().removeStyle(new starStyle());

                }
                else if (magazineName.equals("economical")){
                    EconomicalMagazineSingleton.getInstance().removeStyle(new starStyle());

                }
                else {
                    System.out.println("wrong name");
                }
            }

        }



    }
}
