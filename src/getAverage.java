public class getAverage {
    public static double getAverage(int values[]) {
        double average;
        double sum = 0;
        for (int x = 0; x < values.length; x++){
            sum = sum + values[x];
        }
        average =  sum / values.length;
        return average;
    }
}
