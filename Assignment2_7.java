import java.util.Scanner;
class TollBoothBill{
    private String vehicleType;
    private int noOfAxels;
    private double distanceTravelled;
    private double tollFee;
    private double totalAmountDue;

    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
    public void setNoOfAxels(int noOfAxels){
        this.noOfAxels = noOfAxels;
    }
    public int getNoOfAxels(){
        return this.noOfAxels;
    }
    public void setDistanceTravelled(double distanceTravelled){
        this.distanceTravelled = distanceTravelled;
    }
    public double getDistanceTravelled(){
        return distanceTravelled;
    }

    public double calculateTollFee(){
        if(this.vehicleType.equals("car")||this.vehicleType.equals("bus")||this.vehicleType.equals("vans")){
            this.tollFee = this.noOfAxels * 0.25 * this.distanceTravelled; 
        }
        else{
            this.tollFee = this.noOfAxels * 0.5 * this.distanceTravelled;
        }
        return this.tollFee;
    }
    public double generateBill(){
        double procFee = 2.0;
        this.totalAmountDue = this.tollFee + procFee;
        return this.totalAmountDue;
    }
    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        int choice =0;
        do{
            System.out.println("1.Enter vehicle type:\n2.Enter of number of axels\n3.Enter distance travelled\n4.Calculate toll fee\n5.Generate Bill\n6.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: 
                    System.out.print("Enter vehicle type: ");
                    this.setVehicleType(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter number of axels: ");
                    this.setNoOfAxels(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter distance travelled: ");
                    this.setDistanceTravelled(sc.nextDouble());
                    break;
                case 4:
                    if(this.vehicleType != null && this.getDistanceTravelled() != 0.0 && this.getNoOfAxels() != 0){
                        this.calculateTollFee();
                        System.out.println("TollFee Calculated");
                    }
                    else{
                        System.out.println("Please enter relevant information!");
                    }
                    break;
                case 5:
                    if(this.tollFee != 0){
                        this.generateBill();
                        System.out.println("Bill generated!\nPress Exit");
                    }
                    else{
                        System.out.println("Please calculate tollFee!");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Sorry invalid option!");
                    break;
            }
        }while(choice!=6);
        System.out.println("Total amount to be paid: "+this.totalAmountDue);
    }
}



public class Assignment2_7 {
    public static void main(String[] args){
        TollBoothBill b1 = new TollBoothBill();
        b1.showMenu();
    }
}
