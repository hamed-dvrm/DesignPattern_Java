public class Subscriber {

    SubscriberInfo info;
    String status;

    public Subscriber(SubscriberInfo s){
        info = s;
        status = null;
    }

    public void update(String status){
        this.status = status;


    }

    public String toString(){
        return (info.toString() + status);
    }
}
