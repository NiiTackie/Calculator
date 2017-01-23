import java.util.Scanner;
public class Calc
{
  public static void main(String[] args)
  {
    double int1, int2, result;
    int operation;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your first number");
      int1 = in.nextDouble();
    System.out.println("Enter your second number");
      int2 = in.nextDouble();
     
      Scanner sign = new Scanner(System.in);
    
    System.out.println("Choose from the operation 1 to add, 2 to subtract,3 to multiply or 4 to divide");
    operation = sign.nextInt();
    
     if (operation == 1 ){
          result = int1 + int2;
           System.out.println(result);
          }

       if (operation == 2 ){
         result = int1 - int2;
          System.out.println(result);
       }
     if (operation == 3 ){
          result = int1 * int2;
           System.out.println(result);
          }
	//divide
	   if (operation == 4 ){
          result = int1 / int2;
           System.out.println(result);
          }
  }
}