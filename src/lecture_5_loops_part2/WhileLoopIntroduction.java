package lecture_5_loops_part2;

public class WhileLoopIntroduction {

    public static void main(String[] args) {

        // Loop: use this to execute a code segment
        //       desired number of times
        //
        // Order of exe:
        //          1. Analyze the condition
        //          2. If the condition --> false, then terminate the loop exe
        //          3. If the condition --> true, then the exe the loop body once
        //          4. Go back to step 1

        int number = 1;

        while(number <= 10) {
            System.out.println(number);
            number++;

        }

    }
}
