package lecture_5_loops;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // 1. create a while loop that counts from 12 to 24
        //    and when the counter is 19, display "hello there 19!"

         int num = 12;
         while(num < 25) {
             System.out.println(num);
             num++;
             if (num == 19) System.out.println("hello there 19!");
         }





          // 2. create a while loop that counts from 0 to 20 that
          //     ignore the display of these numbers
          //     4, 7, 11, 13
          int counter = 0;

         while(counter <= 20) {

             if(counter == 4 || counter == 7 || counter == 11 || counter == 13) {


             }
             else {
                 System.out.println(counter);

             }
             counter++;
         }
    }
}
