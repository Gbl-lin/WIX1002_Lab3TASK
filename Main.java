import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] points = new int[3][2];

        System.out.println("Enter 3 points, one point per line (x y):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Point " + (i + 1) + ": ");
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }

        if (isBoomerang(points)) {
            System.out.println("true  (it is a boomerang)");
        } else {
            System.out.println("false  (it is not a boomerang)");
        }

        input.close();
    }

    public static boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        int cross = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
        return cross != 0;
    }
}
