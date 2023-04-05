
class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    ElectricityBill(String customerName, double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }
    public void calculateBillAmount(){
        double bill = 0;
        if(this.unitsConsumed <= 100)
            bill = this.unitsConsumed * 5;
        else if(this.unitsConsumed > 100 && this.unitsConsumed <= 200){
            bill = (100*5) + ((this.unitsConsumed-100)*7); 
        }
        else{
            bill = (100*5) + (100*7) + ((this.unitsConsumed-200)*10);
        }
        this.billAmount = bill;
    }
    public String getCusotmerName(){
        return this.customerName;
    }
    public double getUnitsConsumed(){
        return this.unitsConsumed;
    }
    public void setUnitsConsumed(double unitsConsumed){
        this.unitsConsumed = unitsConsumed;
    }
    public double getBillAmount(){
        return this.billAmount;
    }

}

public class Assignment2_4{
    public static void main(String[] args){
        ElectricityBill e1 = new ElectricityBill("Muhammad Omar Sirkazi", 150);
        e1.calculateBillAmount();
        System.out.printf("Name: %53s \n",e1.getCusotmerName());
        System.out.printf("Total units consumed: %22.2f \n",e1.getUnitsConsumed());
        System.out.printf("Bill amount to be paid: %20.2f",e1.getBillAmount());
        
    }                                
}