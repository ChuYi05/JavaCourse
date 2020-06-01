package Week11;

public class Student extends Person{
    private String classStatus;

    public Student(){
        classStatus="student";
    }

    public Student(String name,int age,String classStatus){
        super(name,age);
        this.classStatus=classStatus;
    }

    public String getClassStatus(){
        return classStatus;
    }

    public void setClassStatus(String classStatus){
        this.classStatus=classStatus;
    }

    public String study(){
        return getName()+" study";
    }

    //override
    public String toString(){
        return "i am a "+classStatus+", my name is "+super.getName()+", age is "+super.getAge()+". i enjoy with "+enjoy();
    }
}
