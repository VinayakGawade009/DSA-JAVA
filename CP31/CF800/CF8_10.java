import java.util.*;

public class CF8_10 {

    public static void countPoints(int leftCol, int rightCol, int leftRow, int rightRow, int[] points, int row, int col, int ring) {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            String[] mat = new String[10];

            int points[] = {0};

            int leftCol = 0;
            int rightCol = 9;
            int leftRow = 0;
            int rightRow = 9;

            countPoints(leftCol, rightCol, leftRow, rightRow, points, 0, 0, 1);

            System.out.println(points[0]);
        }

        sc.close();
    }    
}
