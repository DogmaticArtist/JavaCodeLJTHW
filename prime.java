import java.util.Scanner;
/**
 * prime
 */
public class prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        int primeCount = 0;
        //Empty String
        String  primeNumbers = "";
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        
        
        
        for (i = 1; primeCount <= 1000; i++)         
        {                    
            int counter=0;           
            for(num =i; num>=1; num--)
            {
            if(i%num==0)
            {
             counter = counter + 1;
            }
       }
       
       if (counter ==2)
       {
          //Appended the Prime number to the String
          primeNumbers = primeNumbers + i + " ";
          
          primeCount = primeCount+ 1;
       }    
        }    
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers);
    }
}