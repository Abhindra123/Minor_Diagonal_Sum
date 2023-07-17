import java.util.Scanner;

public class MinorDiagonalSum {
    public static  int MinorDiagonalSum(int arr[][]){
       int i=0;
       int j=arr.length-1;
       int sum=0;
       while (i<=arr.length-1&& j>=0){
           sum=sum+arr[i][j];
           i++;
           j--;
       }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int val=MinorDiagonalSum(arr);
        System.out.println("The value is : "+val);
    }
}