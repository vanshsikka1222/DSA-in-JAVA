import java.util.Scanner;
public class E3_Number_is_power_of_2 {
    public static void main(String[] args) {
    //Alternative Method
    //     public boolean isPowerOfTwo(int n) {
    //     if(n==0) 
    //         return false;
    //     while(n%2==0) 
    //         n/=2;
    //     return n==1;
    // }

    //Using Bitmanipultaion
    // All power of two numbers has only a one-bit set. So count the no. of set bits and 
    // if you get 1 then the number is a power of 2.
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number to check whether its POWER of 2 or not: ");
        int n = sc.nextInt();
        //Count SET bits
        int count = 0;
        for(int i = 0; i < 4*8; i++) {
            int bitmask = 1 << i;
            if((n & (bitmask)) != 0) {
                count = count + 1;
            }
        }
        if(count == 1) {
            System.out.println("Yes its POWER of 2");
        }
        else {
            System.out.println("No, its Not POWER of 2");
        }
    }
}






