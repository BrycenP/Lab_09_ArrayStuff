import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints;
        int randMin = 1;
        int randMax = 100;
        dataPoints = new int[100];
        Random rando = new Random();

        for (int x = 0; x <dataPoints.length; x++){
            dataPoints[x] = rando.nextInt(randMax)+randMin;
        }
        for (int y = 0; y < dataPoints.length; y++){
            System.out.print(dataPoints[y] + " | ");
        }

    }
}