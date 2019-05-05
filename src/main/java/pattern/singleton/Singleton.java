package pattern.singleton;

/**
 * Complete the Singleton class in your editor which contains the following components:
 * <p>
 * 1. A private Singleton non parameterized constructor.
 * 2. A public String instance variable named
 * <p>
 * .
 * Write a static method named getSingleInstance that returns the single instance of the Singleton class.
 * <p>
 * Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.
 * <p>
 * <p>
 * Input Format
 * <p>
 * You will not be handling any input in this challenge.
 * <p>
 * Output Format
 * <p>
 * You will not be producing any output in this challenge.
 * <p>
 * <p>
 * Sample Input
 * <p>
 * hello world
 * <p>
 * <p>
 * Sample Output
 * <p>
 * Hello I am a instance! Let me say hello world to you
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    /**
     * Here, we’ve created a static inner class that holds the instance of the Singleton class.
     * It creates the instance only when someone calls the getInstance() method and not when the outer class is loaded.
     *
     * @return Singleton instance.
     */
    public static Singleton getSingletonInstance() {
        return SingletonHolder.instance;
    }
}
