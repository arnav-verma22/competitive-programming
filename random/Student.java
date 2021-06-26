import java.io.Serializable;
import java.util.*;  
class Student implements Serializable
{
    public String Reg;
    public String name;
    public String email;
    public String address;
    

    public Student(String reg, String name, String email, String address)
    {
        this.Reg = reg;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    public static void main(String args[])
    {
        Student s1 = new Student("19BCE0911", "Adi", "adi.roshan2019", "jaipur");
        Student s2 = new Student("19BCE0931", "Arn", "arn.ver2019", "lucknow");
        Student s3 = new Student("19BIT0911", "shre", "shre.var2019", "Delhi");

        Student arr[] = {s1, s2, s3};

        FileOutputStream fout=new FileOutputStream("Student.txt");  
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(arr);  
        out.flush(); 

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("Student.txt"));  
        Student arra[] =(Student)in.readObject(); 

        boolean flag=false;
        for (Student student : arra) {
            if(student.Reg.indexOf("BCE"))
            {
                flag = true;
                System.out.println(student);
            }  
        }
        if(!flag)
        {
            System.out.println("no such student");
        }
    }
}