public class Mars extends Planet {
    private static Mars instance;

    private Mars() {
        super("Mars");
    }

    public static Mars getInstance() {
        if (instance == null) {
            instance = new Mars();
        }
        return instance;
    }
}
