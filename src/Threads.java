/**
 * Created by krish98sai on 11/1/2016.
 */
public class Threads {
    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
              for(int i = 1000000; i<=10000000; i++){
                  System.out.println(i);
              }
            }
        }, "T1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = -1000000; i >= -10000000; i--){
                    System.out.println(i);
                }
            }
        }, "T2");

        t1.start();
        t2.start();

    }
}
