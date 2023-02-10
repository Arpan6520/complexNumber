import java.util.Scanner;

public class Robot {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the Name :\n");
                String name = input.nextLine();
                System.out.print("Enter the Creator Name :\n");
                String creator = input.nextLine();
                System.out.print("Enter the Purpose :\n");
                String purpose = input.nextLine();
                System.out.print("Memory Space :\n");
                int memorySpace = input.nextInt();
                System.out.print("Speed :\n");
                float speed = input.nextFloat();
                System.out.println("My Details :");
                System.out.println("I am the Robot named " + name + ".");
                System.out.println("I was created by " + creator + ".");
                System.out.println("I am created for the purpose of " + purpose + ".");
                System.out.println("My memory space is around " + memorySpace + "Gb and my speed is " + speed + "Tb.");
        }
}












