package mar20class;

class Student
{
String name;
int rollno;
Student(String name,int rollno)
{//read the variable provided i am having the same variable then we use this
this.name=name; //String name1=name;
this.rollno=rollno;//int rollno1=rollno;
}
public static void main(String[] args){
Student s1=new Student("Noman",101);//location1/address(Noman and 101)
Student s2=new Student("Abu",102);//location2/address(Abu and 102)
Student s3=new Student("Latha",101);//location3 Latha and 101
Student s4=s1;//s4=location1
System.out.println(s1.equals(s2));// ->return boolean values ->false
System.out.println(s1.equals(s3));// ->false
System.out.println(s1.equals(s4));//true
}}
