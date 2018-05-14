import java.util.Scanner;
public class HelloWorld{
   public static void main(String[]arg){
      Scanner input = new Scanner(System.in);
      System.out.println("Hello World");
      System.out.print("What is your name: ");
      String name = input.nextLine();
      System.out.println("Welcome "+name);
   }
}