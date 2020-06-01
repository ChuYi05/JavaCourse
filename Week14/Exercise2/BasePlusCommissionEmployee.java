package Week14.Exercise2;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, int id, Date birthDate, double sale, double rate, double baseSalary){
        super(name,id,birthDate,sale,rate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary >= 0.0)
            this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("Base salary must be >=0.0");
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    public String toString(){
        return String.format("%s %s %s %.2f","Base-salaried ",super.toString(),"base salary ",getBaseSalary());
    }

}
