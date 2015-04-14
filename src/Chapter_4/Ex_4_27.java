package Chapter_4;

/**
 * Created by Toxa on 14.04.2015.
 */
public class Ex_4_27 {
    public static void main(String[] args) {
        //Li4uljnuk dlja elementiv v rjadky
        int count = 1;
        //For pereburaje vsi roku
        for (int year = 2001; year < 2100; year++){
            //Shykajemo vusokosnuj rik
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                //Vporjadkovyjemo vuvid po 10 elem v rjadky
                if (count % 10 == 0){
                    System.out.println(year);
                } else {
                    System.out.print(year + " ");
                }
                //Pislja kozhnogo prohody li4uljnuk zbiljshyjetsja na 1
                count++;
            }
        }
    }
}
