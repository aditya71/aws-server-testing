/**
 * Created by krish98sai on 11/10/2016.
 */
import java.io.*;
import java.nio.ByteBuffer;

public class InputTest {
    public static void main(String[] args) {
    }

    public static String recieveInput(InputStream inp) throws IOException {
        int bytesRead = 0;
        ByteBuffer buffer = ByteBuffer.allocate(4);
        while(bytesRead < 4){
            bytesRead += inp.read(buffer.array(), bytesRead, 4-bytesRead);
        }

        int length = buffer.getInt();
        ByteBuffer buffer1 = ByteBuffer.allocate(length);
        int counter = 0;
        while(counter < length+1) {
            inp.read(buffer1.array(), bytesRead, length);
        }
    }
}