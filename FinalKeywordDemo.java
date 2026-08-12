class Student{
    final int rollno;
    String name;
    Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    final void ShowStudent(){
        System.out.println("student Details");
        System.out.println("Roll no:" +rollno);
        System.out.println("Name:" +name);
    }
}
final class College{
    String collegename="scsvmv";
    void ShowCollege()
    {
        System.out.println("collegename:"+collegename);
    }
}
public class FinalKeywordDemo{
    public static void main(String[]args)
    {
        Student s1=new Student(101,"chandu");
        Student s2=new Student(93,"tharish");
        s1.ShowStudent();
        System.out.println();
        s2.ShowStudent();
        System.out.println();
        College c=new College();
        c.ShowCollege();
    }
}