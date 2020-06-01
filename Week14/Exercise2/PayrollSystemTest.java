package Week14.Exercise2;

public class PayrollSystemTest {
    public static void main(String[] args){
        //Create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("Li ming",1001,new Date(7,24,1980),500);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Wang Fang",1002,new Date(2,28,1977),20.5,40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Hu Xue",1003,new Date(5,15,1985),1000,0.08);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Zhu Bin",1004,new Date(9,23,1992),200,0.05,1000);

        System.out.println("Employees process individually:");
        System.out.printf("%s %s %.2f\n",salariedEmployee, "earned:",salariedEmployee.earnings());
        System.out.printf("%s %s %.2f\n",hourlyEmployee,"earned:",hourlyEmployee.earnings());
        System.out.printf("%s %s %.2f\n",commissionEmployee,"earned:",commissionEmployee.earnings());
        System.out.printf("%s %s %.2f\n\n",basePlusCommissionEmployee,"earned:",basePlusCommissionEmployee.earnings());

       //Compelet the code here

    }

}
