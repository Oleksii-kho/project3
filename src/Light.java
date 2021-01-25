class Light {
    public static void main (String args[]) {

        int lightspeed;
        long days;
        long seconds;
        long distanceKm;
        long distanceM;

        // скорость света 299792458 м/с
        lightspeed = 299792458;
        days = 2;
        seconds = days * 24 * 60 * 60;
        distanceM = lightspeed * seconds;
        distanceKm = lightspeed * seconds / 1000;

        System.out.print("За " + days+"дня ");
        System.out.println(" свет пройдет " + distanceM + " метров ");
        System.out.println(" или " + distanceKm + " километров");
    }
}