public class MultithreadThing extends Thread{

    private int num;
    public MultithreadThing(int num){
        this.num = num;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i + " from thread "+num);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
