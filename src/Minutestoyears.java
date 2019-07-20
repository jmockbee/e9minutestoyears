public class Minutestoyears {


    public static void printYearsAndDays (long minutes){

        if (minutes<0) {
            System.out.println("Invalid Value");
        }else {
            long years = minutes / 525600;
            // account for leap year
            long days = (minutes % 525600) / 1440;
            String answer = minutes + " min = " + years + " y and " + days + " d";
            System.out.println(answer);

        }
    }


}
