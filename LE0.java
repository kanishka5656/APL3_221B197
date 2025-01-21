/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class JUET
{
	String name;
	int age;
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	public static void main(String[] args) {
		JUET m1 = new JUET();
		m1.setName("Kanishka");
		m1.setAge(21);
		System.out.println(m1.getName()+" "+m1.getAge());
	}

}