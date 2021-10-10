package lecture_3_operators;

public class CompoundAssignmentOperator {

     public static void main(String[] args) {
       // Assignment Operator (=)
       // this operator assigns the value to the variable to the left.

         int number = 10;
         // Compound Assignment Operators
         // combination of arithmetic operators and the assignment operator
         // Normally these actions are two single operations
         // += updates the value by addition
         // -+ updates the value by subtraction
         // *= updates the value by multiplication
         // /= updates the value by division
         // %= updates the value by modular


         //Example#1
         int b = 5;// assignment
         System.out.println(b);// 5
         b = b + 12; // addition (arithmetic)

         System.out.println(b);// 17

         //Example#2
         int c = 5;
         c += 12;
         System.out.println(c);

         //Example#3 compound assignment - subtraction number is equal to 10
         System.out.println(number);// 10
         number -= 6;//
         System.out.println(number);// 4




    }
}
