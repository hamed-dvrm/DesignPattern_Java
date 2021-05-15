import java.time.LocalDate;

public class SportMagazineSingleton extends MagazineSingleton {

    public static SportMagazineSingleton sportInstance;

    private SportMagazineSingleton(){
        magazineName = "SportMagazine";
        chiefEditorName = "Martin Tyler";
        foundedDay = LocalDate.parse("1955-11-12");
        id = hashCode();
        subscriberList.clear();
        strat = new CourierStrategy();
        state = new EditingState();

        // we have some attributes that has not been initialised yet.
    }

    public static synchronized  SportMagazineSingleton getInstance(){
        if (sportInstance == null){
            sportInstance = new SportMagazineSingleton();
        }
        return sportInstance;
    }

    @Override
    public void setStrat(SendStrategy s) {
        strat =s;
        System.out.println( this.toString() + "'s publishing method has been set to " + s.toString());

    }

    public String toString(){
        return magazineName;
    }





}
