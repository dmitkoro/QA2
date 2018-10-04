import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("!");



  Scanner reader = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int num = reader.nextInt();

                if(num % 2 != 0)
                    System.out.println(num + " is odd");
                else
                    System.out.println(num + " is even");
            }


}

