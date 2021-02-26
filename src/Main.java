import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args){

        IphoneXCharger iphoneXCharger = new IphoneXCharger();
        S10Charger s10Charger = new S10Charger();

        System.out.println("\nThe IphoneCharger says: ");
        iphoneXCharger.charge();
        iphoneXCharger.longevity();

        System.out.println("\nThe SamsungCharger says: ");
        s10Charger.charge();
        s10Charger.longevity();

        System.out.println("\nChecking if s10 charger is a samsung charger:");
        chargeSamsung(s10Charger);


        System.out.println("\nAdapting IphoneCharger to charge samsung  with IphoneSamsung Adapter");
        chargeSamsung(new IphoneSamsungAdapter(iphoneXCharger));

    }

    public static void chargeSamsung(SamsungCharger sCharger){
        sCharger.charge();
        sCharger.longevity();
    }
}
