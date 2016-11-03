import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Created by adity on 11/1/2016.
 */
public class testing_1 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("what is the host's adress");
                String hostname = scanner.nextLine();
                if(hostname.equals("exit")) {
                    break;
                }
                Socket socket = new Socket();
                socket.setSoTimeout(3500);
                socket.connect(new InetSocketAddress(hostname, 25999));
                socket.setSoTimeout(0);

                InputStream in = socket.getInputStream();
                while(true) {
                    ByteBuffer buffer = ByteBuffer.allocate(4);
                    int ofset = 0;
                    while(ofset < 4){
                        ofset+= in.read(buffer.array(), ofset, 4- ofset);
                    }
                    int messageLength = buffer.getInt(0);
                    ofset = 0;
                    while(ofset < messageLength){
                        ofset+= in.read(buffer.array(), ofset, 4- ofset);

                    }
                    System.out.println(new String(buffer.array(), Charset.forName("UTF-16")));
                }

            } catch (IOException e) {
                System.out.println(e.getCause());
                continue;
            }
        }

    }
}
