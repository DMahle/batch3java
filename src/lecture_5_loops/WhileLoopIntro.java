package lecture_5_loops;

public class WhileLoopIntro {

    // Main method
    // Where code execution takes place
    public static void main(String[] args) {

      // Example 1: counting up to 100
      int counter= 0;
      while(counter <= 100) {
          System.out.println(counter);
          counter++; // updater
      }


        // Example 2: Counting down from 10 to 0
          int number = 10;
          while(number > 0) {
             System.out.println(number);
             number--;
         }



        // Example 3: stopping the loop     break;
        // Example 4: skipping in the loop   continue;
    }
}
