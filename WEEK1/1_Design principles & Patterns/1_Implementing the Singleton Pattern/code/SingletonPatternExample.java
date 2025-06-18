public class SingletonPatternExample {
    static class Logger {// pnt-2.1
        private static Logger instance;

        // private constructor
        // step-1
        private Logger() {// pnt-2.2
            System.out.println("Logger initialized");
        }

        // public static method
        // provide access to the instance
        // step-2
        public static Logger getInstance() // pnt-2.3 //u can put any name here
        {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        public void log(String message) {
            System.out.println("LOG: " + message);
        }
    }

    // to test pnt-4,here we testing here itself instead of creating new file
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("First log instance");

        Logger log2 = Logger.getInstance();
        log2.log("Second log instance");

        if (log1 == log2) {
            System.out.println("Singleton working..");
        } else {
            System.out.println("Singleton failed.");
        }
    }
}
