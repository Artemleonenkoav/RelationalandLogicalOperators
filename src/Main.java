public class Main {
    public static void main (String[] args){
        int a = 9;
        int b = 4;

        if ( a < b ) {
            System.out.println("This will never print because it is false." );
        }
        if ( a <= b ) {
            System.out.println("This will never print because it is false." );
        }
        if ( a == 4 ) {
            System.out.println("This will never print because it is false." );
        }
        if ( b == 4 ) {
            System.out.println("The expression (b == 4) is true." );
        }
        if ( a != b ) {
            System.out.println("The expression (a != b) is true." );
        }
        if ( a > b ) {
            System.out.println("The expression (a > b) is true." );
        }
        if ( a >= b ) {
            System.out.println("The expression (a >= b) is true." );
        }
        if ( (a != b) && (a > b) ) {
            System.out.println("This will be printed because both conditions are true." );
        }
        if ( (a != b) || (a < b) || ( a == 4 ) ) {
            System.out.println("This will be printed because one of the conditions is true." );
        }
    }
} 