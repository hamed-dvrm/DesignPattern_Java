public interface MagazineState {
     void getEditingProgress();
     void startPrinting(MagazineSingleton magazine);
     void getPrintingProgress();
     void startPublishing(MagazineSingleton magazine);
     boolean publish();

}
