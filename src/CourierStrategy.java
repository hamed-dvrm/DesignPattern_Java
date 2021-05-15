public class CourierStrategy implements SendStrategy {
    @Override
    public void send(int index) {

        System.out.println("Courier : Character " + index + " got the notification");

    }
    public String toString(){
        return "courier";
    }
}
