import java.util.Scanner;

public class IfElseStatements {

    public void init() {

    }




    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade");

        int n = scan.nextInt();
        System.out.println(n);

        if ( n >= 50 && n <= 100) {
            System.out.println("voldoende");
        }


        else if ( n <= 50 && n >= 0) {
            System.out.println("onvoldoende");
        }
    }

    public void paint() {
    }

}
