public class IphoneSamsungAdapter implements SamsungCharger{

    private final IPhoneCharger iPhoneCharger;

    public IphoneSamsungAdapter(IPhoneCharger iPhoneCharger) {
        this.iPhoneCharger = iPhoneCharger;
    }

    @Override
    public void charge() {
        this.iPhoneCharger.charge();
    }

    @Override
    public void longevity() {
        this.iPhoneCharger.longevity();
    }
}
