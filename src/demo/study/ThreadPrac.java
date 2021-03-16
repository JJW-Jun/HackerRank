package demo.study;


public class ThreadPrac {
    static long startTime = 0;

    public static void main(String args[]) {
        ThreadE threadE = new ThreadE();
        threadE.start();
        startTime = System.currentTimeMillis();

        for(int i=0; i<300; i++){
            System.out.printf("%s", new String("-"));
        }

        System.out.print("소요시간1: "+ (System.currentTimeMillis()-ThreadPrac.startTime));
    }
}


class ThreadE extends Thread{
    public void run(){
        for(int i=0; i<300; i++){
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간2: "+(System.currentTimeMillis()-ThreadPrac.startTime));
    }
}