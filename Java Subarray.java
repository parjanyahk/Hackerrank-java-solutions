import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        len = sc.nextInt();
        int arr[] = new int[len];
        for(int i =0 ;i<len ; i++)
        {
            arr[i] = sc.nextInt();  
            
        }
        sc.close();
        System.out.println(negativeSubArrays(arr));
        
    }
    private static int  negativeSubArrays(int[] arr)
    {
        int count = 0;
        for(int i =0 ; i<arr.length ; i++)
        {
            int sum = 0;
            for(int j = i ; j<arr.length ; j++)
            {
                sum+= arr[j];
                if(sum<0){
                    count++;
                }
            }
            
        }
        return count;
    }
}
