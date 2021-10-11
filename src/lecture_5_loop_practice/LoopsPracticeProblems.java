package lecture_5_loop_practice;

public class LoopsPracticeProblems {
    public static void main(String[] args) {

        // Print the following 10 times without using a loop
        // system.out.println("My name is" + " ")
        // now use a while loop to print it out

        System.out.println("My name is" + "Dustin");

        int n = 0;
        while (n <= 10) {
            System.out.println("My name is" + "Dustin");
            n++;

            int y = 0;
            while (y < 20) {
                System.out.println(y);
                y += 4;


            }
            for (int counter = 0; counter <= 25; counter += 5) {
                System.out.println("This is the current loop number:" + counter + '.');
            }

            int i = 0;
            for(; i < 6;) {
                System.out.println("i= " +i);  x % 9
                i++;
            }
            // when would we use a for loop instead of a while loop
            // you would use a for loop when you know its a infinite loop

            for(int num = 1; num <20; num++) {
                System.out.println(num);
            }



        }


    }
}
