import java.util.Scanner;

public class HekkoWorld {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //capitalization is important noted
        //Also learned it has out correct with words
        System.out.println("What is your name?");
        String firstName = input.nextLine();

        System.out.printf("Hello %s!\n",firstName);
        System.out.printf("Goodbye %s!\n",firstName);

    }
}
