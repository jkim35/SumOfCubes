import java.util.Scanner;
public class SumOfCubes{
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int digit;
        int sum = 0;
        int i = 1;
        int digitCubed;
        int number = myObj.nextInt();
        while(number != 0){
            digit = (int) ((int) (number%Math.pow(10, i) )/Math.pow(10, i-1));
            digitCubed = digit*digit*digit;
            sum = sum+ digitCubed;
            number = (int) (number - digit*(Math.pow(10, i-1))) ;
            i++;
            
            
            
            System.out.println(sum);
                }

    System.out.print(sum);
        
    }
}