import java.util.Scanner ;

public class Asset{

public static void main(String args[]){

Scanner input = new Scanner (System.in);
int assetId = input.nextInt();
String assetName = input.next();
float assetValue = input.nextFloat();


System.out.println("Asset tracking numer :" +assetId);
System.out.println("Asset name :" +assetName);
System.out.println("Asset value :" +assetValue);
}
}
