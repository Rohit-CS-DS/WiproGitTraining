
public class Student {
	String name = "Rohit";
	void show(){
		String area = "Bhopal";
		System.out.println(name+" is from "+ area);
	}
	public static void main(String args[]) {
		Student st=new Student();
		st.show();
	}

}
