import java.util.Scanner;
public class M2_Best_time_to_buy_and_sell_Stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Price Rate: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //LOGIC to find the Max Profit
        //Least So Far
        int lsf = Integer.MAX_VALUE;
        //Profit If Sold Today
        int pist = 0;
        //Overall Profit
        int op = 0; 
        for(int i = 0; i < n; i++) {
            if(arr[i] < lsf) {
                lsf = arr[i];
            }
            pist = arr[i] - lsf;
            if(pist > op) {
                op = pist;
            }
        }
        System.out.println("The MAX Profit " + op);
    }
}
