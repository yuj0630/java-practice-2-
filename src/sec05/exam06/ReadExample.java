package sec05.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
public class ReadExample {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("C:/Temp/test1.db");
        while(true) {
            int data = is.read();
            if(data == -1) break;
            System.out.println(data);
        }
        is.close();
    }
}
