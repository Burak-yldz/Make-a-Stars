import java.util.Scanner;
public class Class {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ( n ) : ");
        int n = input.nextInt();
        for (int i = 1; i<= n ; i++){
            for(int j = 1; j<= (i-1) ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= 21-(2 * i); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}