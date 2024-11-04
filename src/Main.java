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
        boolean valIn = false;
        dataPoints = new int[100];
        Random rando = new Random();
        Scanner in = new Scanner(System.in);

        userInput = SafeInput.getRangedInt(in, "enter a value 1-100", 1, 100);

        for (int x = 0; x <dataPoints.length; x++){
            dataPoints[x] = rando.nextInt(randMax)+randMin;
        }
        for (int y = 0; y < dataPoints.length; y++){
            System.out.print(dataPoints[y] + " | ");
            if (dataPoints[y] == userInput){
                int pos = y+1;
                System.out.println();
                System.out.println("SHORT CIRCUIT!!! Your input of " + userInput + " appeared in the position " + pos + " of the array");
                valIn = true;
                break;
            }
        }
        if (!valIn){
            System.out.println();
            System.out.println("Your value of " + userInput + " did not appear in the array");
        }
    }
}