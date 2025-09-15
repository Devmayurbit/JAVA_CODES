class Mydata{
int value;
Boolean flag = true;
synchronized public void set(int v){
while(flag != true)
try{
wait();
}catch(Exception e){}
value = v;
flag = false;
notify();
} 
synchronized public int get(){
int x = 0;
while(flag != false)
try{
wait();
}catch(Exception e){}
x = value;
flag = true;
notify();
return x;

}
	}
class Producer extends Thread{
Mydata d;
Producer(Mydata data){
d = data;
}
public void run(){
int i = 1;
while(true){
d.set(i);
System.out.println("producer" + i);
i++;
}
}
}
class Customer extends Thread{
Mydata d;
Customer(Mydata data){
d = data;
}
public void run(){

while(true){
System.out.println("customer" + d.get());
}
}
}
class Inter_thread{
public static void main(String[] args){
Mydata m  = new Mydata();
Producer p = new Producer(m);
Customer c = new Customer(m);
p.start();
c.start();

}
}