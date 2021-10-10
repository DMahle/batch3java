package lecture_3_operators;

public class UnaryOperators {
    public static void main(String[] args) {
        //Unary operators (++ , --)
        // This arithmetic operators only applies to single variables
        // ++ <-- this operator will increment the data value your variable// ++

        // Decrement unary operator (--)
        // -- <- this operator will decrement by 1



        //Two ways to use this operator
        // prefix: using this way applies the operations before any other operations
        // postfix: using this way applies the operation after any operations pending

        int age = 20;
        System.out.println(++age); // adds one for this line

        System.out.println(age++); // adds one after this line

        // Practice problem increment unary operator

        int eggs = 8;
        System.out.println("Number of eggs"+ eggs);
        // chicken lay an egg after I check the coop
        eggs++;

        System.out.println("Number of eggs in the after noon" + eggs);// 9
        eggs++;
        System.out.println("Number of eggs in the morning after"+ eggs );// 10

        //Practice for prefix
        //++ [numerical variable]

        System.out.println("Number of eggs in the"+ eggs);
        // Chicken lays an egg right before I check
        ++eggs; // Added 1 more egg now the total is 11
        System.out.println("Number of eggs");

        //Practice Decrement Unary operator
        int Countdown = 10;
            --Countdown;//9
        System.out.println(Countdown);// 9
        System.out.println(--Countdown);// 8
        System.out.println(Countdown--);// 8
        System.out.println(Countdown);// 7
    }
}
