

public class StringCount {

    public static void main(String[] args){

        String str = "aBfdcG5";
        Integer max_word = 26;

        int sum = 0;

        char[] charArray = str.toCharArray();

        for(int i=0; i<charArray.length;i++) {
            for (int j = 0; j < charArray.length; j++) {

                if (charArray[i] < charArray[j]) {
                    Character temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
            sum++;
        }
        System.out.println("Sorted string " + String.valueOf(charArray));
        System.out.println("Sorted sum " + sum);

        }

    }

