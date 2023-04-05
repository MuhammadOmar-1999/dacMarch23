package Assignments.Assignment2_solutions;

import java.util.Scanner;

class BMI{
    private double height;
    private double weight;

    BMI(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public Double calculateBMI(){
        double bmi = this.weight / (this.height * this.height);
        return bmi;
    }
}
class Assignment2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: ");
        double height = sc.nextDouble();
        System.out.println("Enter Weight: ");
        double weight = sc.nextDouble();
        BMI b = new BMI(height, weight);
        double bmi = b.calculateBMI();
        System.out.println("BMI = "+bmi);
    }
}
