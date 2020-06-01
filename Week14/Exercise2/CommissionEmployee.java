package Week14.Exercise2;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, int id, Date birthDate, double grossSales, double commissionRate){
        super(name,id,birthDate);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setGrossSales(double grossSales){
        if(grossSales >= 0.0)
            this.grossSales = grossSales;
        else
            throw new IllegalArgumentException("Gross sales must be >=0.0");
    }

    public double getGrossSales(){
        return this.grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate >= 0.0)
            this.commissionRate = commissionRate;
        else
            throw new IllegalArgumentException("Commission rate must be>=0.0");
    }

    public double getCommissionRate(){
        return this.commissionRate;
    }

    @Override
    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s %.2f %s %.2f","Commission employee",super.toString(),"gross sales",grossSales, "commission rate ",getCommissionRate());
    }
}
