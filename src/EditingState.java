import java.util.Random;

public class EditingState implements MagazineState {

    @Override
    public void getEditingProgress() {
        Random rand = new Random();
        System.out.println("Editing progress is : " + rand.nextInt(101));
    }

    @Override
    public void startPrinting(MagazineSingleton magazine) {
        PrintingState state = new PrintingState();
        magazine.setState(state);
        System.out.println("state has been changed to : " + state);


    }

    @Override
    public void getPrintingProgress() {
        System.out.println("wrong state");
    }

    @Override
    public void startPublishing(MagazineSingleton magazine) {
        System.out.println("wrong state");
    }

    @Override
    public boolean publish() {
        System.out.println("wrong state");
        return false;

    }

    public String toString(){
        return ("EditingState");
    }
}
