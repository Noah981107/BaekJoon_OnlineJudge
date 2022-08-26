import java.util.Arrays;
import java.util.Scanner;

public class Solve_16466 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int cnt = 0;

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != i+1)
            {
                System.out.println(i+1);
                cnt++;
                break;
            }
        }
        if(cnt == 0)
            System.out.println(num+1);
    }
}
