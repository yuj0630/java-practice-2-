package sec06.exam06;

import java.io.*;
public class NonBufferVsBufferExample {
    //기본 스트림 생성
    public static void main(String[] args) throws Exception {
        String originalFilePath1 =
                NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        // 보조 스트림 생성
        String originalFilePath2 =
                NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis,fos); // 복사 시간 측정(FIleInput, FileOutput)
        System.out.println("버퍼를 사용하지 않았을 떄: \t" + nonBufferTime + "ns");

        long BufferTime = copy(bis, bos); // 복사 시간 측정(BufferInput, BufferOutput)
        System.out.println("버퍼를 사용했을 떄: \t" + BufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
    static int data = -1;
    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime(); // 시작시간 저장
        while(true) { // 파일 복사 : 원본 파일에서 읽은 1byte를 타깃 파일로 바로 출력
            data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime(); // 끝 시간 저장
        return (end-start); // 복사에 걸린 시간 리턴
    }
}
