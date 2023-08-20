import java.util.*;
public class E1_Count_Set_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number to check Set Bits in it: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < 4*8; i++) {
            int bitmask = 1 << i;
            if((n & (bitmask)) != 0) {
                count = count + 1;
            }
        }
        System.out.println("Total number of SET Bits in number = " + count);
    }
}
//By Vansh Sikka












