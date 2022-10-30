package dev.vladd;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        int         a = Integer.parseInt(args[0]);
        String operation = args[1];
        int         b = Integer.parseInt(args[2]);

        int result = 0;

        Calc calc = new Calc();

        switch (operation) {
            case "+" : result = calc.addition(a, b); break;
            case "-" : result = calc.subtraction(a, b); break;
            case "*" : result = calc.multiplication(a, b); break;
            case "/" : result = calc.division(a, b); break;
        }

        System.out.println("RESULT="+result);

    }
}
