public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("I am flying as far as I want to.");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
