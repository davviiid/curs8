package ro.fasttrackit.curs8;

public class Print {
    import ro.fasttrackit.curs8.interfaces.MessageSender;

    public class print implements Advertisement {
        public void send(String Advertisement) {
            System.out.println(Advertisement);
        }

        public int getCost() {
            return 0;
        }
    }
}