// Given an array of 0s,1s. A Robot is trying to reach the end of the array. Robot begins at 0,0. Robot can move down and right,Cannot pass through walls that are denoted by 1.

// LOGIC:This is a graph problem and can be solved using recursion, if the Robot reachees last indeex return True else return False.

import java.util.*;

public class _4 {
    static boolean reached=false;
    static void findPath(int m,int n,int[][] arr){
        if(m==arr.length || n==arr[0].length)return;
        if(arr[m][n]==1)return;
        System.out.println("Go to:"+m+" "+n);
        if(m==arr.length-1 && n==arr[0].length-1)
        {   
            reached=true;
            return;
        }
        if(!reached)findPath(m+1, n, arr);
        if(!reached)findPath(m, n+1, arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter m value:");
        m=sc.nextInt();
        System.out.println("Enter n value:");
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        findPath(0,0,arr);
        if(reached)System.out.println("True");
        else System.out.println("False");
    }
}
