import java.util.Scanner;
public class E5_Mismatching_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        // Find XOR (^) of two number, say A and B.
        // And let their result of XOR(^) of A & B be C;
        // Count number of set bits (1’s ) in the  binary representation of C;
        // Return the count;
        int xor = a^b;
        //Now will find set bits in xor
        int count = 0;
        for(int i = 0; i < 4*8; i++) {
            int bitmask = 1 << i;
            if((xor & bitmask) != 0) {
                count = count + 1;
            }
        }
        System.out.println("Number of Mismatching BITS = " + count);
    }
}


