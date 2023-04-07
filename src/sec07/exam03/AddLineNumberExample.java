package sec07.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "src/sec02/verify/exam02/addLineNumberExample.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        int rowNumber = 0;
        String rowData;
        while((rowData=br.readLine()) != null){
            System.out.println(++rowNumber + ":" + rowData);
        }

        br.close();
    }

}
