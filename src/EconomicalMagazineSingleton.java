import java.time.LocalDate;

public class EconomicalMagazineSingleton extends MagazineSingleton {

    public static EconomicalMagazineSingleton economicalInstance;

    private EconomicalMagazineSingleton(){
        magazineName = "EconomicalMagazine";
        chiefEditorName = "Mr.economy";
        foundedDay = LocalDate.parse("1961-08-07");
        id = hashCode();
        subscriberList.clear();
        strat = new CourierStrategy();
        state = new EditingState();

    }

    public static synchronized  EconomicalMagazineSingleton getInstance(){
        if (economicalInstance == null){
            economicalInstance = new EconomicalMagazineSingleton();
        }
        return economicalInstance;

    }
    public String toString(){
        return magazineName;
    }

    @Override
    protected void setStrat(SendStrategy s) {
        strat = s;
    }
}
