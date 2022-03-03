import java.util.Scanneer ;
public class SumOfDigit {
    public static void main(String[] args ){
         Scanner input = new Scanner (System.in);

         System.out.println("Input an integer between 0 to 1000 :");
         int num = input.nextInt();

         int firstDigit = num%10;
         int remainingNumber = num/10;

         int SecondDigit = remainingNumber%10;
         remainingNumber = remainingNumber/10;

         int thirdDigit = remainingNumber%10;
         remainingNumber = remainingNumber/10;

         int fourthDigit = remainingNumber%10;
         int sum = thirdDigit + SecondDigit + firstDigit +_ fourthDigit ;
         System.out.println("The Sum of all digit is " +num+ "is" +sum);
    }
}