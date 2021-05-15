public class Online implements SendStrategy {
    @Override
    public void send(int index) {

        System.out.println("Online : We send notification to character " + index );

    }

    public String toString(){
        return "online";
    }
}
