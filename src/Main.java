//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         *
         */
        Planet a = Soleil.getInstance();
        Planet b = Terre.getInstance();
        Planet c = Mars.getInstance();

        Satellite s = new Satellite("Land satellite");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);

    }
}