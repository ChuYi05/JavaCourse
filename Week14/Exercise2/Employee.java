package Week14.Exercise2;

public abstract class Employee {
    private String name;
    private int id;
    private Date birthDate;
    

    public Employee(String name, int id, Date birthDate){
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public int getMonth(){
        return birthDate.getMonth();
    }

    @Override
    public String toString(){
        return String.format("Name:%s   Id:%d  BirthDate:%s",getName(),getId(),birthDate);
    }

    public abstract double earnings();

}
