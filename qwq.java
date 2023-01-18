public class qwq {
    public static void main(String[] args) {
    }
    
    OnesComplement number = new OnesComplement("11000001101100000000000000000000");

    public class OnesComplement {
        private String binaryString;
        private int decimalValue;
      
        public OnesComplement(String binaryString) {
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
            
            number.calculateDecimalValue();

            int decimalValue = number.getDecimalValue();

            System.out.println(decimalValue);

          }
        }
      }

      

    
}

