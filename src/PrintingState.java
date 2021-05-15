import java.util.Random;

public class PrintingState implements MagazineState {
    @Override
    public void getEditingProgress() {
        System.out.println("wrong state");
    }

    @Override
    public void startPrinting(MagazineSingleton magazine) {
        System.out.println("wrong state");
    }

    @Override
    public void getPrintingProgress() {
        Random rand = new Random();
        System.out.println("Printing  progress is : " + rand.nextInt(101));

    }

    @Override
    public void startPublishing(MagazineSingleton magazine) {
        magazine.setState(new PublishingState());
        System.out.println("State has been changed to  " + magazine.state);
    }

    @Override
    public boolean publish() {
        System.out.println("wrong state");
        return false;

    }

    public String toString(){
        return ("PrintingState");
    }
}
