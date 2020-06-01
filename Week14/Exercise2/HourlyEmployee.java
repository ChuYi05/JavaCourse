package Week14.Exercise2;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String name, int id, Date birthDate, double wage, double hours){
        super(name,id,birthDate);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage){
        if(wage >= 0.0)
            this.wage = wage;
        else
            throw new IllegalArgumentException("Hourly wage must be>=0.0");
    }

    public double getWage(){
        return this.wage;
    }

    public void setHours(double hours){
        if(hours >= 0.0)
            this.hours = hours;
        else
            throw new IllegalArgumentException("Hours worked must be >=0.0");
    }

    public double getHours(){
        return this.hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString(){
        return String.format("Hourly employee: %s %s %.2f %s %.2f",super.toString(),"hourly wage",getWage(),"hours worked",getHours());

    }
}
