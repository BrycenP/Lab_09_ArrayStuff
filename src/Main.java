import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints;
        int randMin = 1;
        int randMax = 100;
        int dataSum = 0;
        int dataMean;
        dataPoints = new int[100];
        Random rando = new Random();

        for (int x = 0; x <dataPoints.length; x++){
            dataPoints[x] = rando.nextInt(randMax)+randMin;
        }
        for (int y = 0; y < dataPoints.length; y++){
            dataSum = dataPoints[y] + dataSum;
            System.out.print(dataPoints[y] + " | ");
        }
        dataMean = dataSum / 100;
        System.out.println();
        System.out.println("The sum of all the values is " + dataSum);
        System.out.println("The average of all the values is " + dataMean);

    }
}