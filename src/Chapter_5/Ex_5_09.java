package Chapter_5;

/**
 * Created by Toxa on 30.04.2015.
 */
public class Ex_5_09 {
    public static void main(String[] args) {
        //vvodumo zna4ennja i bydyjemo tablu4ky
        System.out.println("Feet\tMeters\t|\tMeters\t Feet");
        System.out.println("-----------------------------------");
        //This loop shykaje rezyljtat i vuvodutj v pravuljnomy porjadky
        for (double feet = 1, meters = 20; feet < 11; feet++, meters += 5) {
            System.out.printf("%.3f\t%.3f\t|\t%.3f\t %.3f",feet, footToMeter(feet), meters, meterToFoot(meters));
            System.out.println();
        }
    }
    //Metod peretvorjye foot na meters
    public static double footToMeter(double feet){
        double meters = feet * 0.305;
        return meters;
    }
    //Metod peretvoryje meters na foot
    public static double meterToFoot(double meters){
        double feet = meters * 3.279;
        return feet;
    }
}
