import java.util.Scanner;
import java.util.logging.*;


public class WordAnalyzerTester{
   private static  Logger LOGGER = Logger.getLogger( "Test" );
   /**
    * @param args
    */
   public static void main(String[] args){
      test("aardvark"); // expect: a
      test("roommate"); // expect: o (not m)
      test("mate"); // expect: 0 (no duplicate letters)
      test("test"); // expect: 0 (the t isn't repeating)
      test("testtest"); // expect: t

      LOGGER.setLevel(Level.ALL);
      try
      {
         test(null);
         test("");
      }
      catch (NullPointerException e)
      {
         System.out.println("Caught the exception.");
         LOGGER.log( Level.SEVERE, "null is not a valid input"+e.toString());
      }
      
      Scanner words = new Scanner(System.in);
      String word;
        do {
            System.out.println("Enter a word to test:");
            word = words.nextLine();
            test(word);

            System.out.println("Do you want to continue? (Y/N)");
            String answer = words.nextLine();

            switch (answer.toLowerCase()) {
                case "y":
                    break; // Continue loop
                case "n":
                    System.out.println("Goodbye");
                    return; // Exit the program
                default:
                    System.out.println("Invalid input. Goodbye.");
                    return; // Exit the program
            }
        } while (true);
    

   }

   public static void test(String s)
   {
      
      WordAnalyzer wa = new WordAnalyzer(s);
      char result = wa.firstRepeatedCharacter();
      if (result == 0)
         System.out.println("No repeated character.");
      else
         System.out.println("First repeated character = " + result);
   }
}

