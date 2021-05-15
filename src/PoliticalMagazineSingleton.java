import java.time.LocalDate;

public class PoliticalMagazineSingleton extends MagazineSingleton {

    public static PoliticalMagazineSingleton politicalInstance;

    private PoliticalMagazineSingleton(){
        magazineName = "PoliticalMagazine";
        chiefEditorName = "Sadegh ZibaKalam";
        foundedDay = LocalDate.parse("2015-01-03");
        id = hashCode();
        subscriberList.clear();
        strat = new CourierStrategy();
        state = new EditingState();
    }

    public static PoliticalMagazineSingleton getInstance(){
        if (politicalInstance == null){
            politicalInstance = new PoliticalMagazineSingleton();
        }
        return politicalInstance;
    }

    public String toString(){
        return magazineName;
    }

    @Override
    protected void setStrat(SendStrategy s) {
        strat = s;
    }
}
