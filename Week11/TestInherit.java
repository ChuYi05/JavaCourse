package Week11;

public class TestInherit {
    public static void main(String[] args) {
        Person p1=new Person();
        Student s1=new Student("Alice",19,"student");
        StudentAssistant sa1=new StudentAssistant();

        System.out.println(p1);
        System.out.println(s1+". "+s1.study());
        System.out.println(sa1+". "+sa1.study()+". "+sa1.work());
    }
}
