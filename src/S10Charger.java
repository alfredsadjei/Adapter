public class S10Charger implements SamsungCharger{
    @Override
    public void charge() {
        System.out.println("Charging phone quickly!");
    }

    @Override
    public void longevity() {
        System.out.println("Will probably last forever... ");
    }
}
