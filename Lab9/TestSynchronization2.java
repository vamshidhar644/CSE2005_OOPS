package Lab9;

class Sender
{
    public void send(String msg)
    {
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println(" Thread Interrupted");
        }
        System.out.println("\n "+msg+" sent");
    }
}
class B extends Thread
{
    Sender obj;
    String msg;
    B(String msg, Sender obj)
    {
        this.msg = msg;
        this.obj = obj;
    }
    public void run()
    {
        synchronized(obj)
        {
            obj.send(msg);
        }
    }
}
class TestSynchronization2
{
    public static void main(String[] args)
    {
        Sender obj1 = new Sender();
        B obj2 = new B("Hello ", obj1);
        B obj3 = new B("Hello, I am doing good, How are you?",obj1);

        obj2.start();
        obj3.start();

   
    }
}