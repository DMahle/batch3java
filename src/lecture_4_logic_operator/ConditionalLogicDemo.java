package lecture_4_logic_operator;

public class ConditionalLogicDemo {

    public static void main(String[] args) {

        // 1. Relational Operators
        // [number1] [RO] [number2] -----> [true/false]
        //  Symbol:
        //        greater than              >
        //        greater tan or equal to   >=
        //        less than                 <
        //        less than or equal to     <=
        //        equal to                  ==
        //        not equal to              !=
        boolean ans1 = 10 > 2;
        System.out.println(ans1);

        boolean ans2 = 10 >= 10;
        System.out.println(ans2);

        boolean ans3 = 10 < 20;
        System.out.println(ans3);

        boolean ans4 = 10 <= 10;
        System.out.println(ans4);

        boolean ans5 = 10 == 3;
        System.out.println(ans5);

        boolean ans6 = 2 != 16;
        System.out.println(ans6);


        // 2. Logical Operators
        //  boolean: [true/false]
        // [boolean] [LO] [boolean] ----> [boolean]
        // Symbol:
        //        &&    AND
        //        ||    OR
        //        !     NOT

        //AND operator ( && )
        System.out.println(true && true );// true
        System.out.println(true && false );// false
        System.out.println(false && true );// false
        System.out.println(false && false );// false

        boolean result = false && true;
        System.out.println(result); //

        // OR operator ( || )
        System.out.println("----------||--------"); // true
        System.out.println(true || true ); //true
        System.out.println(true || false );//true
        System.out.println(false || false);// true
        System.out.println(false || false);// false

        // NOT operator ( ! ) flipper
        System.out.println("------------!----------");
        System.out.println(!true); // false
        System.out.println(!false);// true

        // Example
        boolean a = true;
        boolean b = true;
        boolean c = true;

        boolean result1 = !a || (b && c );
        System.out.println(result1);



        // 3. Branching ( if statement )
        if(true){
             // if true code will execute
            // if false it will be ignored
        }
        // 4. Conditional Operators


    }
}
