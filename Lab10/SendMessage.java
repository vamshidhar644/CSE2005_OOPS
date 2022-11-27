package Lab10;

class Communication {
	 boolean flag = false;
	 public synchronized void wait(String msg)	 {
		 if (flag)  {
			 try {
				 wait();
			 }
			 catch (InterruptedException e) { 
				 System.out.print(e);
			 }
		}

		 System.out.println(msg);
		 flag = true;
		 notify();
	 }
	 
	 public synchronized void notify(String msg) {
		 if (!flag) {
			 try  {
				 wait();
			 } 
			 catch (InterruptedException e) { 
				 System.out.print(e);
			 }
		 }
		 
		 System.out.println(msg);
		 flag = false;
		 notify();
	 }
}

class T1 implements Runnable {
	 Communication com;
	 String[] Str1 = { "Hi!", "How are you ?", "I am also doing fine!" };
	 
	 public T1(Communication m1) 	 {
		 this.com = m1;
		 new Thread(this, "Question").start();
	 }
	 
	 public void run() 	 {
		 for (int i = 0; i < Str1.length; i++) 
		 {
			 com.wait(Str1[i]+" T1");
		 }
	 }
}

class T0 implements Runnable {
	 Communication com;
	 String[] Str2 = { "Hello!", "I am good, what about you?", "Great!" };
	 
	 public T0(Communication m2) 
	 {
		 this.com = m2;
		 new Thread(this, "Answer").start();
	 }
	 
	 public void run() 
	 {
		 for (int i = 0; i < Str2.length; i++) 
		 {
			 com.notify(Str2[i]+" T0");
		 }
	 }
}

public class SendMessage {
	public static void main(String[] args) 	{
		Communication m = new Communication();
		new T1(m);
		new T0(m);
	}
}