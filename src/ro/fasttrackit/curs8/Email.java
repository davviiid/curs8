package ro.fasttrackit.curs8;

public class Email {

    import ro.fasttrackit.curs8.interfaces.MessageSender;

    public class EMailSender implements Advertisement {
        public void send(String Adverstisement) {
            System.out.println(Adverstisement);
        }

        @Override
        public int getCost() {
            return 0;
        }
    }
}