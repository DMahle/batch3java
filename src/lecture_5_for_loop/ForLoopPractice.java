package lecture_5_for_loop;

public class ForLoopPractice {

    public static void main(String[] args) {

        // Ex1: counting down from 100 to 1
        for(int i = 40; i >= 1; i--) {
            System.out.println(i);
        }

        // ex2: counting down and displaying only even number
        // number % 2 ====> 0   even number
        // number % 2 ====> 1   odd  number
        for(int i = 40; i >= 1; i--) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
