package Week14.Exercise2;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String name, int id, Date birthDate,double weeklySalary){
        super(name,id,birthDate);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary >= 0.0)
            this.weeklySalary = weeklySalary;
        else
            throw new IllegalArgumentException("Weekly salary must be >=0.0");
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }


    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("Salaried employee: %s %s: %.2f", super.toString(), "weekly salary",getWeeklySalary());
    }

}
