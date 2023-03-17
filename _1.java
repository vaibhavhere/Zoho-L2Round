// Given a set of numbers where each number act as length of an side of triangle.
// Find the total number of combinaions of trainagle that can be formed using the given set length.

// LOGIC: Trangle property is used here where sum of length of two sides greater than the third side. A+B>C
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k,ans=0;
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                for(k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k]){
                        ans++;
                        System.out.println(ans+". {"+arr[i]+","+arr[j]+","+arr[k]+"}");
                    }
                }
            }
        }
        if(ans==0)System.out.println("No triangle possible!");
    }
}
