package ro.fasttrackit.curs8;

public class Facebook {
    import ro.fasttrackit.curs8.interfaces.MessageSender;

    public class FacebookSender implements Advertisement {
        public void send(String Adverstisement) {
            System.out.println(Adverstisement);
        }

        public int getCost() {
            return 0;
        }
    }
}