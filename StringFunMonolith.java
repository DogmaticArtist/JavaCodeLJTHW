import java.util.Scanner;

public class StringFunMonolith {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a message: ");
        String msg = keyboard.nextLine();

        // reverse 
        String rev = "";
        for ( int i=msg.length()-1; i>=0; i-- )
            rev += msg.substring(i,i+1);
            System.out.println(rev);

        // camel-case 

        String lower = rev.toLowerCase();
        String[] words = lower.split(" ");
        String result = "";
        for ( String w : words )
            result += w.substring(0,1).toUpperCase() + w.substring(1);

            System.out.println(result);

    }
    
}
