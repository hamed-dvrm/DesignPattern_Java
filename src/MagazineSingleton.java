import java.time.LocalDate;
import java.util.ArrayList;

public class MagazineSingleton {

    protected  String magazineName;
    protected  String chiefEditorName;
    protected LocalDate foundedDay;
    protected int id;

    protected ArrayList<Subscriber> subscriberList = new ArrayList<>();
    protected SendStrategy strat;
    protected  MagazineState state;
    protected ArrayList<Styles> styleList = new ArrayList<>();
    private static MagazineSingleton instance;

    protected MagazineSingleton(){
    }

    public static synchronized MagazineSingleton getInstance(){
        if (instance == null)
            instance = new MagazineSingleton();
        return instance;

    }

    protected void notifySubscribers(String status){
        for(Subscriber temp : subscriberList){
            strat.send(temp.info.getId());
            temp.update(status);

        }
        System.out.println("End of notifying");
    }

    protected  void setState(MagazineState state){
        this.state = state;
    }

    protected void getEditingProgress(){
        state.getEditingProgress();
    }

    protected  void startPrinting(){
        state.startPrinting(this);
    }

    protected void getPrintingProgress(){
        state.getPrintingProgress();

    }

    protected  void  startPublishing(){
        state.startPublishing(this);
    }

    protected  void publish(String status){
        boolean returnState;
        returnState = state.publish();
        if (returnState){
            notifySubscribers(status);
        }
    }
    
    protected void setStrat(SendStrategy s){
    }

    protected void printMagazine(){
        for(Styles tempStyle : styleList){
            tempStyle.printStyle();
        }
        System.out.println("Name : " + magazineName);
        System.out.println("Date established : " + foundedDay);
        System.out.println("Hashcode : " + id);
        System.out.println("Head : " + chiefEditorName);
    }

    protected void subscribe(Subscriber s){
        subscriberList.add(s);
    }

    protected void  printSubscribers(){
        for(Subscriber tempsub : subscriberList){
            System.out.println(tempsub);
        }
    }

    protected void removeStyle(Styles s){
        for (Styles tempStyle : styleList){

            if (tempStyle.getClass() == s.getClass()){
                styleList.remove(tempStyle);
                return;
            }
        }
    }

    protected void addStyle(Styles s){
        styleList.add(s);
    }




}
