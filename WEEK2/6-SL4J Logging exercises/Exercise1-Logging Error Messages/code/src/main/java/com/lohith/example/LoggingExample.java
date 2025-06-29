
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("started..");

        logger.warn("Warning message");

        logger.error("Error message");

        logger.info("End.");
    }

}
