package Week11;

public class StudentAssistant extends Student{
    static int id=0;

    public StudentAssistant(){
        id++;
        setName("sa_"+id);
    }

    //override enjoy()
    public String enjoy(){
        return "helping students in need";
    }

    public String work(){
        return getName()+"work";
    }

    public String toString(){
        return "i am a student assistant, my name is "+getName()+", age is "+getAge()+". i enjoy with "+enjoy();
    }
}
