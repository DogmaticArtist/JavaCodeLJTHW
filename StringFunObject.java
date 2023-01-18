public class StringFunObject {
    
    String message; 

    
    public void setMessage( String s) {
        message = s;
    }

    
    public String getMessage() {
        return message;
    }

    
    public void reverse() {
        String rev = "";
        for ( int i=message.length()-1; i>=0; i-- )
            rev += message.substring(i,i+1);

        message = rev;


    }

    public void remhalf() { 
        String wr1 = "";
        for ( int i=0; i<=(message.length()-1) / 2; i++)
            wr1 += message.substring(i,i+1);
        
        message = wr1;
    }
    

    public void camelCase() {
        String[] words = message.toLowerCase().split(" ");
        String result = "";
        for ( String w : words )
            result += w.substring(0,1).toUpperCase() + w.substring(1);

        message = result;
    }
}
