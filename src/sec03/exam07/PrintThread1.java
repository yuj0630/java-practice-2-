package sec03.exam07;

public class PrintThread1 extends Thread {
    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop;
    }

    public void run(){
        while(!stop){
            System.out.println("실행 중");
        }
        System.out.println("지원 원리");
        System.out.println("실행 종료");
    }

}
