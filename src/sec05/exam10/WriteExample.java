package sec05.exam10;

import java.io.FileWriter;
import java.io.Writer;
public class WriteExample {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test8.tct");

        char[] array = {'A', 'B', 'C'};

        writer.write(array);

        writer.flush();
        writer.close();
    }
}
