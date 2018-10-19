public class Main {

    public static void main(String[] args) {
        // write your code here
        double distanceTotal = distanceCalc(25, -15, 23, -20); //1-2
        distanceTotal += distanceCalc(23, -20, 21, -24); //2-3
        distanceTotal += distanceCalc(21, -24, 20, -27); //3-4
        distanceTotal += distanceCalc(20, -27, 19, -35); //4-5
        distanceTotal += distanceCalc(19, -35, 21, -46); //5-6
        distanceTotal += distanceCalc(21, -46, 28, -56); //6-7
        distanceTotal += distanceCalc(28, -56, 25, -65); //7-8
        distanceTotal += distanceCalc(25, -65, 28, -70); //8-9
        distanceTotal += distanceCalc(28, -70, 32, -73); //9-10
        distanceTotal += distanceCalc(32, -73, 34, -74); //10-11
        distanceTotal += distanceCalc(34, -74, 36, -73); //11-12
        distanceTotal += distanceCalc(36, -73, 39, -73); //12-13
        System.out.printf("The hurricane travelled %f kilometers.", distanceTotal);
    }

    public static double distanceCalc(double phi1, double lambda1, double phi2, double lambda2) {
        phi1 = Math.toRadians(phi1);
        phi2 = Math.toRadians(phi2);
        lambda1 = Math.toRadians(lambda1);
        lambda2 = Math.toRadians(lambda2);
        double a = Math.pow(Math.sin((phi2 - phi1) / 2), 2) + Math.cos(phi1) * Math.cos(phi2) * Math.pow(Math.sin((lambda2 - lambda1) / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return 6371 * c; //km
    }

}

