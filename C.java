//program on multiple classes in a java source file 

class A
{
	void display()
	{
		System.out.println("Display A");
	}
}
class B
{
	void show()
        {
           System.out.println("Show B");
        }
}
class C
{
	public static void main(String args[])
	{
	    System.out.println("c");
	    A a= new A();
	    a.display();
	    B b= new B();
	    b.show();
	}
}

