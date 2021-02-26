public class IphoneXCharger implements IPhoneCharger{
    @Override
    public void charge() {
        System.out.println("Charging phone as quickly as I want tbh.");
    }

    @Override
    public void longevity() {
        System.out.println("Will disintegrate after one year of use.");
    }
}
