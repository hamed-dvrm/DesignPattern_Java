public class PublishingState implements MagazineState {
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
        System.out.println("wrong state");

    }

    @Override
    public void startPublishing(MagazineSingleton magazine) {
        System.out.println("wrong state");

    }

    @Override
    public boolean publish() {
        return true;
    }

    public String toString(){
        return ("PublishingState");
    }
}
