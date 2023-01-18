public class SquareRootTester {
    public static void main(String[] args) {
        
        SquareRootFinder sqrt = new SquareRootFinder();

        double max = 0, maxN = 0;
        int count = 0;
        double fakeroot, realroot, diff;

        System.out.print("Testing square root algorith...");
        for ( double n = 0; n<=2000; n += 0.01 ) {
            System.out.println(n);
            sqrt.setNumber(n);
            fakeroot = sqrt.getRoot();
            realroot = Math.sqrt(n);
            diff = Math.abs( fakeroot - realroot );
            if ( diff > max) {
                count++;
                max = diff;
                maxN =n;
            }
        }

        if ( max > 0.000001) {
            System.out.println("FAIL");
            System.out.println("Worst difference was " + max + " for " + maxN);
        }

        else 
            System.out.println("Pass");
            
        System.out.println("The total errors is" + (count -1) ) ;

    }
}
