import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * Created by adity on 11/2/2016.
 */
public class Microsoft_problem6 {
    public static void main(String [] args) {

              /*  Scanner scan = new Scanner(System.in);//fill w file name
                String str = scan.nextLine();

                //ArrayList<Integer> list = new ArrayList<Integer>();
                //System.out.println("Hello");
                String[] splitted = str.split("\\s+");
                */



                Scanner in = new Scanner(System.in);
                String a = in.nextLine();
                int spaces = 0;
                for(int i = 0; i < a.length(); i ++){
                if(a.charAt(i) == ' '){
                spaces++;
                }
                }
                String[] splitted = new String[spaces];
                int[] list = new int[splitted.length];
                int placeholder = 0;
                int count = 0;
                for(int i = 0; i < a.length(); i ++){
                    if(a.charAt(i) == ' '){
                    splitted[count] = a.substring(placeholder, i);
                    count++;
                    placeholder = i+1;
                    }
                }
                splitted[splitted.length-1] = a.substring(placeholder);
                for (int i = 0; i < splitted.length; i++){
                    list[i] = Integer.parseInt(splitted[i]);
                }
                Arrays.sort(list);

                for (int l = 0; l < list.length; l++){
                    System.out.print(list[l]+ " ");
                }
                //System.out.println(splitted.toString());
                int first = list[0];
                System.out.println("first is " + first);
                //int last = Integer.parseInt(splitted[splitted.length-1]);
                int last = list[list.length-1];
        int []newArr = new int[(last-first)+1];
        for (int i = 0; i < list.length; i++){
            //System.out.println("list[i]: " + list[i]);
            //System.out.println("first: "  + first);
           // System.out.println()
            newArr[(list[i])-first] = list[i];
        }
        for (int i = 0; i < newArr.length; i++){
            int iter = 0;
            if (newArr[i] != (first + i)){
                iter++;
               // System.out.println("not in array");
                if (iter!=1){
                    System.out.print((first + i) + " ");
                }

            }
        }




        //Integer.parseInt(string inside it);



            }


        }

