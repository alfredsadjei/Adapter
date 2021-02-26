public class WildTurkey implements  Turkey{

    @Override
    public void fly() {
            System.out.println("I am flying only a short distance.");
    }

    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }
}
