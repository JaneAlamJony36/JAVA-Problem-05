import java.util.Scanner;

public class PositiveNegativeSeries{
        public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int sum =0;
        System.out.print("Enter the number of series :");
        int num=input.nextInt();
    for(int i=1;i<=num;i=i+1){
        if(i%2==0)
        sum=sum-i;
        else{
            sum =sum+i;
        }

    }
    

    
    System.out.println(" The sum of the Series is="+sum);
}
}