import java.io.*;
import java.util.*;
import java.lang.*;

public class CompareFile {

    public static void main (String[] args) throws java.io.FileNotFoundException{



            try {
                Scanner scan1 = new Scanner(new File("/Users/vikas/Downloads/second.csv"));
                //Scanner scan1 = new Scanner((new File("/user/vikas/downloads//result-post-aa.csv")));
                Scanner scan2 = new Scanner(new File("/Users/vikas/Downloads/second-copy.csv"));

                while (scan1.hasNext() && scan2.hasNext()){
                    scan1.useDelimiter(",");
                    scan2.useDelimiter(",");
                    String line1 = scan1.next();
                    String line2 = scan2.next();
                   // if (line1 != line2){
                        if (! line1.equalsIgnoreCase(line2)){

                        System.out.println("not matched:" + line1 + ":" + line2 );
                    }
                }


            } catch (Exception E) {


        }


    }
}
