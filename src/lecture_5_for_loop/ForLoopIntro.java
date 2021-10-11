package lecture_5_for_loop;

public class ForLoopIntro {
    public static void main(String[] args) {
        // for loop
        // counting up from 0...10
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10

        for(int num = 0; num <= 10; num++) {
            System.out.println(num);
        }
        // For loop execution order
        //
        // 1. initialization block ( once )
        // 2. condition
        //            |-- false: entire for loop is terminated
        //            |-- true: move on to next step
        // 3. for loop body
        // 4. updater
        // go back to step 2
    }

}
