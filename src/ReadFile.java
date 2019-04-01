import java.io.*;
import java.util.Scanner;

public class ReadFile {


    public static void main(String[] args) throws java.io.FileNotFoundException{
         try{
             Scanner scanner = new Scanner(new File("/Users/vikas/Downloads/result-post-aa.csv"));

             while(scanner.hasNext()){
                 scanner.useDelimiter(",");
                 String name = scanner.next();
                 System.out.println("name:" + name);
             }

         } catch(Exception exception){

         }



        }


}
