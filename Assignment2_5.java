
class TelephoneBill{
    private String customerName;
    private long phoneNumber;
    private int numberOfCalls;
    private int durationOfCalls;

    TelephoneBill(String customerName, long phoneNumber, int numberOfCalls, int durationOfCalls){
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.numberOfCalls = numberOfCalls;
        this.durationOfCalls = durationOfCalls;
    }

    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getNumberOfCalls(){
        return this.numberOfCalls;
    }
    public void setNumberOfCalls(int numberOfCalls){
        this.numberOfCalls = numberOfCalls;
    }
    public void setDurationOfCalls(int durationOfCalls){
        this.durationOfCalls = durationOfCalls;
    }
    public int getDurationOfCalls(){
        return this.durationOfCalls;
    }
    public double calculateBill(){
        int faltRate = 10;
        double bill = 0d;
        if(numberOfCalls<=100){
            bill = 50*numberOfCalls + faltRate;
        }
        else{
            bill = 100*50 + (numberOfCalls-100)*25 + faltRate;
        }
        return bill;
    }
}

class Assignment2_5{
    



}