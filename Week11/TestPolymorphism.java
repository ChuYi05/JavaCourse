package Week11;

public class TestPolymorphism {
    public static void main(String[] args) {
        Person p1=new Person();
        Student s1=new Student();
        StudentAssistant sa1=new StudentAssistant();

        Person p=new Person("pp",15);
        introduction(p,"");
        p=new Student("ss",17,"Student");
        Student ps=(Student)p;
        introduction(ps,". "+ps.study());
        p=new StudentAssistant();
        StudentAssistant pss=(StudentAssistant)p;
        introduction(pss,". "+pss.study()+". "+pss.work());
    }

    public static void introduction(Person p,String x){
        System.out.println(p+x);
    }
}
