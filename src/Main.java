import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints;
        int randMin = 1;
        int randMax = 100;
        int maxCount = 0;
        int minCount = 0;
        int valMin = 1;
        int valMax = 1;
        dataPoints = new int[100];
        Random rando = new Random();
        Scanner in = new Scanner(System.in);

        for (int x = 0; x <dataPoints.length; x++){
            dataPoints[x] = rando.nextInt(randMax)+randMin;
        }
        for (int y = 0; y < dataPoints.length; y++){
            System.out.print(dataPoints[y] + " | ");
        }
        for (int z = 0; z < dataPoints.length; z++){
            if (valMin >= dataPoints[z] ) {
                valMin = dataPoints[z];
            } else if (valMax <= dataPoints[z]) {
                valMax = dataPoints[z];
            }
        }
        for (int i = 0; i < dataPoints.length; i++){
            if (dataPoints[i] == valMin){
                minCount = minCount + 1;
            } else if (dataPoints[i] == valMax) {
                maxCount = maxCount + 1;
            }
        }
        System.out.println();
        System.out.println("The maximum value of the array was " + valMax + " and it appeared " + maxCount + " times");
        System.out.println("The minimum value of the array was " + valMin + " and it appeared " + minCount + " times");
    }
}