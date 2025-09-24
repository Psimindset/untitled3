public class Soleil extends Planet {
    private static Soleil instance;

    /**
     *
     */
    private Soleil() {
        super("Soleil");
    }

    /**
     *
     * @return
     */
    public static Soleil getInstance() {
        if (instance == null) {
            instance = new Soleil();
        }
        return instance;
    }
}
