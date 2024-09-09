import java.util.Scanner;
public class SumOfCubes{
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int digit;
        int sum;
        int number = myObj.nextInt();
        for (int i = 1; i>3; i++){
            digit = number%(10^i);
            digit = digit^3;
            sum = digit;
            number = number - digit;
            
        }
        
    }
}