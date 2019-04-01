import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args){

        int[] plus = {2,4,5};
        int[] result = new int[plus.length];
        for (int i=0;i<plus.length; i++){
            System.out.println("here's the length of i" + i + " here length of array"+ (plus.length));
            if (i == plus.length-1){
                result[i] = plus[i]+1;

            } else{
                result[i] = plus[i];

            }

        }
        System.out.println(Arrays.toString(result));
    }
}
