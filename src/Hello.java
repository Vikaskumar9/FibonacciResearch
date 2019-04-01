
import java.lang.*;

public class Hello {




    public static void main(String[] args) {
        int[] plusOne = {1, 2, 3, 4};
        int[] result = {0, 0 , 0, 0};

        int carry = 0;

        for (int i = 0; i >= plusOne.length; i++) {
            System.out.println(i);
            int val = 0;
            if (i == plusOne.length) {
                val = plusOne[i] + 1;
            } else{
                val = plusOne[i] + carry;
            }
            if (val > 0) {
                carry = 1;
                plusOne[i] = val%10;
            } else {
                carry = 0;
            }

        }

       // for (var x : plusOne){
        //    System.out.println(x);
        //}
    }


}