package Activity1;

public class Removewhitespace {
  public static void main(String[] args) {  
          
        String str1="Y ou rmy  tre as   ure .";  
          
        //Removes the white spaces using regex  
        str1 = str1.replaceAll("\\s+", "");  
          
        System.out.println("String after removing all the white spaces : " + str1);  
    }  
}  
