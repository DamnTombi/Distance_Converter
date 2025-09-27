package App;

public class Main {
    private static final double ConvK_MileToKm = 1.609344;

    static void main(String[] args) {
        System.out.println("Distance converter");


        double km = 12;
        double mile =5;
        double convKmMile = convertMileToKm (mile);
        double convMlKm = convertKmToMile (km);


        System.out.println("Result is "+convMlKm+" Km and "+convKmMile+" mile.");


    }



    // Км и Мили
    private static double convertMileToKm(double mile){
        return mile * ConvK_MileToKm;

    }
    private static double convertKmToMile(double km){
        return km/ConvK_MileToKm;

    }
}
