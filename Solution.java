import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
    ArrayList<Integer>result = new ArrayList<Integer>();
    int sum1=0;
    int sum2=0;
    int sum3=0;
    int sum=0;
    for (int j=0;j<4;j++)
    {
    for (int i=0;i<4;i++)
    {
        sum1=arr[j][i]+arr[j][i+1]+arr[j][i+2];
        sum2=arr[j+2][i]+arr[j+2][i+1]+arr[j+2][i+2];
        sum3=arr[j+1][i+1];
        sum=sum1+sum2+sum3;
        result.add(sum);
    }
    }
    Collections.sort(result);
    System.out.println(result.get(result.size()-1));
    }
}