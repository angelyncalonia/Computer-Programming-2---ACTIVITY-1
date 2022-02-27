package REMOVINGWHITESPACEFROMASTRING;

public class Removingwhitespacefromastring {

public static void main(String[] atgs)

    {
    
      String str = " I L O V E Y O U S O M U C H !";
      
      
      str = str.replaceAll("\\s", "");
      
      
      
         System.out.println(str);
         
         
   }
}