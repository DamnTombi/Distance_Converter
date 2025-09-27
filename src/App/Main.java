package App;

public class Main {
    private static final double ConvK_MileToKm = 1.609344;
    private static final double ConK_NautToKm = 1.852;

    static void main(String[] args) {
        System.out.println("Distance converter");
        System.out.println("App for distance convert");
        System.out.println("Version 1.1");

        double km = 12;
        double mile =5;
        double nautMile = 17;
        double convNmileToKm = convertNauMileToKm (nautMile);
        double convKmToNmile = convertKmToNautMile(km);
        double convKmMile = convertMileToKm (mile);
        double convMlKm = convertKmToMile (km);
        double convMileToNautM = convertMileToNautMile(mile);
        double convNautMileToMile = convertNautMileToMile(nautMile);

        System.out.println("Result Km to Mile is: "+convMlKm);
        System.out.println("Result Km to Nautical mile is: "+ convKmToNmile);
        System.out.println("Result Mile to Km is: "+convKmMile);
        System.out.println("Result Mile to Nautical Mile is: "+convMileToNautM);
        System.out.println("Result Nautical mile to Km is: "+ convNmileToKm);
        System.out.println("Result Nautical mile to Mile is: "+convNautMileToMile);

    }
    //Мили и Морские мили
    private static double convertMileToNautMile (double mile){
        return mile*(ConvK_MileToKm/ConK_NautToKm);
    }
    private static double convertNautMileToMile (double nautMile){
        return nautMile/(ConvK_MileToKm/ConK_NautToKm);
    }

    // Км и Морские мили
    private static double convertNauMileToKm(double nautMile){
        return nautMile*ConK_NautToKm;
    }
    private static double convertKmToNautMile(double km){
        return km/ConK_NautToKm;
    }

    // Км и Мили
    private static double convertMileToKm(double mile){
        return mile * ConvK_MileToKm;

    }
    private static double convertKmToMile(double km){
        return km/ConvK_MileToKm;

    }
}
