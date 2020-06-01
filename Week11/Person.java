package Week11;

public class Person {
    private String name;
    private int age;

    public Person(){
        this.name="John";
        this.age=18;
    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String enjoy(){
        return "being with nature";
    }

    public String enjoy(String a){
        return a;
    }

    //Override
    public String toString(){
        return "i am a person, my name is "+name+", age is "+age+". i enjoy with "+enjoy();
    }
}
