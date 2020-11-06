package CreativeMe;

import java.applet.*;
import java.awt.*;
import java.util.*;

public class TextfieldInArrayTest4 extends Applet {

    public static void main(String[] args) {

        int count, temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements you want in the array ");
        count = scan.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < count; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Array Elements in Ascending Order: ");
        for (int i = 0; i < count; i++) {
            System.out.println(num[i] + ", ");
        }
        System.out.println(num[count - 1]);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
