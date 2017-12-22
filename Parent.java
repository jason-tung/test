public class Parent{
    private int age;
    private String name;
    
    public Parent(int a, String n){
	age = a;
	name = n;
    }
    public Parent(int a){
	Parent(a, "Jerry Ye");
    }
    public Parent(String n){
	Parent (15, n);
    }
    public Parent(){
	Parent(15, "Jerry Ye");
    }

    public String toString(){
	return name + " age " + age;
    }
    public void setAge(int a){
	age = a;
    }
    public void setName(String n){
	name = n;
    }
    public int getAge(){
	return age;
    }
    public String getName(){
	return name;
    }
    
}
