import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints;
        int randMin = 1;
        int randMax = 100;
        int dataSum = 0;
        int dataMean;
        int userInput;
        int userGuess = 0;
        dataPoints = new int[100];
        Random rando = new Random();
        Scanner in = new Scanner(System.in);

        userInput = SafeInput.getRangedInt(in, "enter a value 1-100", 1, 100);

        for (int x = 0; x <dataPoints.length; x++){
            dataPoints[x] = rando.nextInt(randMax)+randMin;
        }
        for (int y = 0; y < dataPoints.length; y++){
            dataSum = dataPoints[y] + dataSum;
            System.out.print(dataPoints[y] + " | ");
            if (dataPoints[y] == userInput){
                userGuess = userGuess + 1;
            }
        }
        dataMean = dataSum / 100;
        System.out.println();
        System.out.println("The sum of all the values is " + dataSum);
        System.out.println("The average of all the values is " + dataMean);
        System.out.println("The value you entered " + userInput + " appeared " + userGuess + " times in the data set");

    }
}