package sec07.exam04;

import java.io.*;
public class GetLineStringFromKeyboard {
    public static void main(String[] args) throws Exception{
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            System.out.println("입력하세요: ");
            String linestr = br.readLine(); // 라인 단위로 문자열을 읽음
            if(linestr.equals("q") || linestr.equals("quit")) break;
            System.out.println("입력된 내용: " + linestr);
            System.out.println();
        }
        br.close();
    }
}
