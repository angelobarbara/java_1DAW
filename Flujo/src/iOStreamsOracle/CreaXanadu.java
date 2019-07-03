package iOStreamsOracle;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CreaXanadu {
    public static void main(String[] args) throws IOException {
    	
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("xanadu.txt"));

                out.println("In Xanadu did Kubla Khan\r\n" + 
                		"A stately pleasure-dome decree:\r\n" + 
                		"Where Alph, the sacred river, ran\r\n" + 
                		"Through caverns measureless to man\r\n" + 
                		"Down to a sunless sea.");
         
        } finally {
        
            if (out != null) {
                out.close();
            }
        }
    }
}
