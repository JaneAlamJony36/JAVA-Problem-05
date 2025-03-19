import java.util.Scanner;
public class OddSeriesSum {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter The Term you want");
        n=input.nextInt();
     for(int i=0;i<n;i++){
        
        int num=2*i+1;
         sum=sum+num*num;

    }
    System.out.println("The Sum of the series is:"+sum);
}
}