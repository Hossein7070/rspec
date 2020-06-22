// TODO: Add includes

public class Main
{
    public void main() {
        String.format("First %s and then %s", "foo", "bar");
        String.format("Display %2$d and then %d", 1, 3);
        String.format("Too many arguments %d %d", 1, 2);
        String.format("First Line%n");
        String.format("Is myObject null ? %b", myObject == null);
        String.format("value is %d", value);
        String s = "string without arguments"; 

        MessageFormat.format("Result {0}.", value);
        MessageFormat.format("Result '{0}'  =  {0}", value);
        MessageFormat.format("Result {0}.", myObject);

        java.util.Logger logger;
        logger.log(java.util.logging.Level.SEVERE, "Result {0}.", myObject);
        logger.log(java.util.logging.Level.SEVERE, "Result {0}'", 14);
        logger.log(java.util.logging.Level.SEVERE, exception, () -> "Result " + param);

        org.slf4j.Logger slf4jLog;
        org.slf4j.Marker marker;
        slf4jLog.debug(marker, "message {}");
        slf4jLog.debug(marker, "message {}", 1);

        org.apache.logging.log4j.Logger log4jLog;
        log4jLog.debug("message {}", 1);
    }
}
