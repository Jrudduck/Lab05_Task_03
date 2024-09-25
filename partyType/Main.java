import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userParty;
        System.out.println("Are you a Republican, Democrat, or Independent? Enter R for Republican, D for Democrat, I for Independent.");
        userParty = scan.nextLine();
        if(userParty.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if(userParty.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        }

        else if(userParty.equalsIgnoreCase("I")) {
            System.out.println("You get a Independent Person.");
        }
        else {
            System.out.println("You have entered an incorrect value.");
        }
    }
}