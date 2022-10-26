import java.util.Scanner;

public class Madlib {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String noun = "trampoline";
        String name = "Dave";
        String adverb = "intensely";
        String number = "Third";
        String yourName = "The Watcher";
        String verbone ="jumping";
        String verbtwo="running";

        // can't put dashes on string names
        //capitalization is important noted
        //Also learned it has out correct with words


        System.out.printf( "Dear %s",name);
        System.out.printf("\n I've heard word that you`ve been caught %s",verbone);
        System.out.printf(" and %s",verbtwo);
        System.out.printf(" ",adverb);
        System.out.printf(" in your fellow " +
                "neighbors yard for the %s",number);
        System.out.printf(" time this week. please stop!\n"+
                "sincerely, %s",yourName);





    }
}

