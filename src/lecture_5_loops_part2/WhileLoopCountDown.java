package lecture_5_loops_part2;

public class WhileLoopCountDown {
    public static void main(String[] args) {
        int num = 100;

        while(num >= 0) {
            System.out.println(num);

            num--; // updater
        }
    }
}
