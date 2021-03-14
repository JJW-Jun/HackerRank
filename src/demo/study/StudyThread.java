package demo.study;

public class StudyThread extends Thread{
    public static void main(String args[]) throws Exception{
        ThreadExtends threadExtends = new ThreadExtends();
        Runnable runnable = new ThreadRunnable();
        Thread thread = new Thread(runnable);

        threadExtends.start();
        thread.start();
    }

}

class ThreadExtends extends Thread{
    public void run(){
    }

    public void throwException(){
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


class ThreadRunnable implements Runnable{

    public void run(){
        System.out.println("implements Runnable: "+Thread.currentThread().getName());
    }
}



