interface X
{
	int a = 50;
	void add();
	void sub();
	void mod();
}
interface Y
{
	int b = 10;
	void mul();
	void div();
	void mod();
}
interface Z extends X,Y
{
}

class Calculator implements Z
{
	public void add()
	{
		System.out.println(X.a + Y.b);
	}
	public void sub()
	{
		System.out.println(X.a - Y.b);
	}
	public void mul()
	{
		System.out.println(Z.a * Z.b);
	}
	public void div()
	{
		System.out.println(X.a / Y.b);
	}
	public void mod()
	{
		System.out.println(X.a % Y.b);
	}
}

public class InterfaceDemo
{
	public static void main(String args[])
	{
	}
}