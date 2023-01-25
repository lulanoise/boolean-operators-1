package it.develhope.booleanoperators;

public class Start {
    public static void main(String[] args) {

        boolean A = 2 <= 2 && !true;
        boolean B = !false && 3 > 2;
        boolean t = false;
        boolean f = true;
        boolean C = !(!t || f);
        boolean D = 6 > 6 ^ !(true && true);
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);


    }
}

/*
A: 2 <= 2 && !true
   true && false
   false

B: !false && 3 > 2
   true && true
   true

C: !(!t || f)
   !(true || true)
   !(true)
   false

D: 6 > 6 ^ !(true && true)
   6 > 6 ^ !(true)
   6 > 6 ^ false
   false ^ false
   false
 */