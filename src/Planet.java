
public abstract class Planet {
    private static Planet instance;  // Singleton instance
    /**
     *  Variable name
     */
    protected String name;

    /**
     *
     * @param name construction
     */
    protected Planet(String name) {
        this.name = name;
    }

    /**
     *
     * @param planet
     * @return  instance singleton
     */
    public static Planet getInstance(Planet planet) {
        if (instance == null) {
            instance = planet;
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */

    @Override
    public String toString() {
        return name;
    }
}
