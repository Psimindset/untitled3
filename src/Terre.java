public class Terre extends Planet {
    private static Terre instance;

    private Terre() {
        super("Terre");
    }

    /**
     *
     * @return
     */
    public static Terre getInstance() {
        if (instance == null) {
            instance = new Terre();
        }
        return instance;
    }
}
