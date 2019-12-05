class HelloWorld {
    private int n;
    class num{
        boolean flag = true;
    }

    public HelloWorld( int n){
        this.n = n;
    }
    boolean flag = true;
    public synchronized void hello() throws InterruptedException{
        num num = new num();
        for (int i = 0; i < n; i++) {
            synchronized (num)
            {
                notify();
                System.out.print("Hello");
                wait();
            }
            if(i == n-1)
            {
                Thread thread = new Thread();
                thread.stop();
            }
        }
   }

    public synchronized void world() throws InterruptedException{
        num num = new num();
        for (int i = 0; i < n; i++) {
            synchronized (num)
            {
                notify();
                System.out.print("World!");
                wait();
            }
            if(i == n-1)
            {
                Thread thread = new Thread();
                thread.stop();
            }
        }
    }

}