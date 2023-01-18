/**
 * q
 */
public class q {

    public static void main(String[] args) {
        
        public class OnesComplement1 {
            private String binaryString;
            private int decimalValue;
          
            public OnesComplement1(String binaryString) {
              this.binaryString = binaryString;
            }
          
            public int getDecimalValue() {
              return decimalValue;
            }
          
            public void calculateDecimalValue() {
              // Convert the binary string to an integer
              decimalValue = Integer.parseInt(binaryString, 2);
              // If the number is negative, subtract it from 2^32
              if (binaryString.charAt(0) == '1') {
                decimalValue = (int) Math.pow(2, 32) - decimalValue;
              }
            }
          }
   }
}