
package testy;
import java.util.Scanner;
import java.lang.Math; 
public class PolowaCiagu {
    String str;
    public PolowaCiagu(String str){
        this.str=str;
    }
    public String polowicznie(String str){
       
       int length = str.length();
       double lengthHalf = Math.floor(length/2);
       String s = "";
        char[] ch = new char[str.length()]; 
  
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
       
       for (int i = 0; i <= lengthHalf; i++) {
           s += ch[i];
       }
		return s;
	}
}
