import java.util .Scanner ;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int temp;
     System.out.println("Enter the element of Array");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();

        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
        
    }
    
}