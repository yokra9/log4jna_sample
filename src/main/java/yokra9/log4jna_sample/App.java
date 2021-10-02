package yokra9.log4jna_sample;

public class App {

    public static void main(String[] args) {
        String message = "";

        for (String arg : args) {
            message += arg;
            message += " ";
        }

        Logging l = new Logging();

        l.fatal(message);
        l.error(message);
        l.warn(message);
        l.info(message);
        l.debug(message);
        l.trace(message);

    }
}
