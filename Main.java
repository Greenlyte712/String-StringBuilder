package main;

public class Main
{

	static void change(String str, int number, StringBuilder sb, Dragon dragon)
	{

		

		System.out.println(" -----------------------");
		System.out.println("| inside method:        |");
		System.out.println("|                       |");
		System.out.println("| " + str.replace(str, "String changed") + "        |");
		System.out.println("| " + sb.replace(0, sb.length(), "StringBuilder changed") + " |");
		System.out.println("|                       |");
		System.out.println(" -----------------------");

		number = 300;

	}

	public static void main(String[] args)
	{

		System.out.println();
		System.out.println("before change:");
		System.out.println();

		String a = "I am a String and so I am immutable";

		System.out.println(a);

		int b = 100;
		
		System.out.println(b);

		StringBuilder c = new StringBuilder("I am  a StringBuilder so I am mutable");

		System.out.println(c);

		Dragon d = new Dragon("sam", 30);
		System.out.println(d);

		System.out.println();
		System.out.println("after change() is called:");

		change(a, b, c, d);

		System.out.println(a + " <------- No");
		System.out.println(b + " <------- No");
		System.out.println(c + " <------- Yes");
		System.out.println(d + " <------- Yes");

	}

}

class Dragon
{

	private String name;
	private int age;

	public Dragon(String name, int age)
	{

		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "{\"name\":" + "\"" + name + "\"" + "," + "\"age\":" + age + "}";

	}

}
