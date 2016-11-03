/**
 * Created by adity on 11/2/2016.
 */
    import java.util.*;
public class Microsoft_problem3 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int spaces = 0;
        for(int i = 0; i < a.length(); i ++){
            if(a.charAt(i) == ' '){
                spaces++;
            }
        }
        String[] x = new String[spaces];
        int placeholder = 0;
        int count = 0;
        for(int i = 0; i < a.length(); i ++){
            if(a.charAt(i) == ' '){
                x[count] = a.substring(placeholder, i);
                count++;
                placeholder = i+1;
            }
        }
        x[x.length-1] = a.substring(placeholder);


        String anwser = "";
        anwser+= x[0] + " ";
        for(int i = 0; i < spaces-1; i++){

            if(x[i].equals(x[i+1])){
                anwser += "blank";
                continue;
            }
            /*else if(x[i].equals("blank")){
                anwser += x[i+ 1] + " ";
                continue;
            }else if(x[i+1].equals("blank")) {
                anwser += x[i] + " ";
                continue;
            }
            if(x[i].equals("red") && x[i+1].equals("blue") ||x[i+1].equals("red") && x[i].equals("blue") ){
                anwser += "purple ";
                continue;
            }
            if(x[i].equals("red") && x[i+1].equals("yellow") ||x[i+1].equals("red") && x[i].equals("yellow") ){
                anwser += "orange ";
                continue;
            }
            if(x[i].equals("blue") && x[i+1].equals("yellow") ||x[i+1].equals("blue") && x[i].equals("yellow") ) {
                anwser += "green ";
                continue;
            }*/


        }
        anwser+=x[x.length-1];


        System.out.println(anwser);
    }



}
