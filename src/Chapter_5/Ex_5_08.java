package Chapter_5;

/**
 * Created by Toxa on 29.04.2015.
 */
public class Ex_5_08 {
    public static void main(String[] args){
        //Robumo tablu4ky
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("----------------------------------------------");
        //Pereburajemo zna4ennja v tabluci. Dani vneslu odrazy do tsukly
        for (double celsius = 40, fahrenheit = 120; celsius > 30; celsius--, fahrenheit -= 10){
            //Vuvid zna4enj 4erez PRINTF
            System.out.printf("%.2f\t%.1f\t\t|\t%.1f\t\t%.2f",celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
            System.out.println();
        }
    }
    //Metod peretvorjyje celsius do fahrenheit
    public static double celsiusToFahrenheit(double celsius){
        double f = (9.0 / 5) * celsius + 32;
        return f;
    }
    //Metod peretvoryje fahrenheit do celsius
    public static double fahrenheitToCelsius(double fahrenheit){
        double c = (5.0 / 9) * (fahrenheit - 32);
        return c;
    }
}
