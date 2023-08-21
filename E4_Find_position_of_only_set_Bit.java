import java.util.Scanner;
public class E4_Find_position_of_only_set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number(in decimal form): ");
        int n = sc.nextInt();
        for(int i = 0; i < 4*8; i++) {
            int bitmask = 1 << i; //Left Shift
            if((n & bitmask) != 0) {
                System.out.println("The Position of Only SET BIT in Number is: " + (i+1));
                break;
            }
            else {
                continue;
            }
        }  
    }
}
//Eg : 4 = 100 (pos of Set bit = 3(index = 2))
//Eg : 8 = 1000 (pos of Set bit = 4(index = 3))





