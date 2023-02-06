class A{  
A(){  
System.out.println("parent class constructor A()");  
}  
}  
  
class B3 extends A{  
B3(){  
super();  
System.out.println("child class constructor B()");  
}  
  
B3(int a){  
super();  
System.out.println("child class constructor B3(int a) "+a);  
}  
  
{System.out.println("instance initializer block is invoked");}  
  
public static void main(String args[]){  
B3 b1=new B3();  
B3 b2=new B3(10);  
}  
}  