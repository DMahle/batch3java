package lecture_4_logic_operator;

public class BranchingDemo {
    public static void main(String[] args) {

        // IF statement
        //syntax:
        //      if ( condition ) {
        //            // code here...
        //       }
        //
        //   condition can be: Relation Operators
        //                      Logical Operators
        //                      something that returns either true/false
        // if the condition is true --> code black will be executed
        // if the condition is false --> code block will be ignored

        if(true) {
            System.out.println("Hello there");

        }

        if(false) {
            System.out.println("Hello there");

        }
        // IF statement
        //syntax:
        //      if ( condition ) {
        //            //code block A
        //            // code here...
        //       }
        //        else {
        //             // code block B
        //             //code here....
        //   condition can be: Relation Operators
        //                      Logical Operators
        //                      something that returns either true/false
        // if the condition is true --> code black will be executed
        // if the condition is false --> code block will be ignored


        int number = 10;
        if(number < 20) {
            System.out.println("code block A");
        }
        else {
            System.out.println("code block B");
        }
    }
}
