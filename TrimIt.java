public class TrimIt
{
   public static void main(String[] args)
   {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
       
      /* Your work goes here */
      sentence1 = sentence1.trim();
      sentence2 = sentence2.trim();
      sentence3 = sentence3.trim();
      String message = sentence1.concat(sentence2).concat(sentence3);
      
      
      System.out.println(message);
   }
}