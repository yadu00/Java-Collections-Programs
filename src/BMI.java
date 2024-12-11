import java.util.*;
class Bmi{
    private float h,w,m;
    private float b;
    public Bmi(float h,float w){
        this.h=h;
        this.w=w;
    }
    public void details(){
        System.out.println("========================================");
        System.out.println("-------------BMI CALCULATOR-------------");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE HEIGHT IN CENTIMETERS : ");
        h=sc.nextFloat();
        if(h<1){
            System.out.println("Invalid Height Entered");
            System.out.print("ENTER THE HEIGHT IN CENTIMETERS : ");
            h=sc.nextFloat();
        }
        System.out.print("ENTER THE WEIGHT IN KILOGRAMS : ");
        w=sc.nextFloat();
        if(w<1){
            System.out.println("Invalid Weight Entered");
            System.out.print("ENTER THE WEIGHT IN KILOGRAMS : ");
            w=sc.nextFloat();
        }



    }
    public void calculation(){
        m=h/100;
        b=w/(m*m);
    }
    public void display(){

        System.out.println("Height : "+h+"cm");
        System.out.println("Weight : "+w+"Kg");
        System.out.println();
        System.out.println("-------------BODY MASS INDEX-----------");
        System.out.println();
        System.out.println("BMI OF THE PERSON : "+b+" Kg/m^2 ");

        if(b<18.5){

            System.out.println("The Person Is UnderWeight");
        }
        else if(b>=18.5 && b<24.9){
            System.out.println("The Person Is Healthy");
        }
        else if(b>=24.9 && b<30){
            System.out.println("The Person Is OverWeight");
        }
        else{
            System.out.println("The Person Is Obese");
        }
        System.out.println();
        System.out.println("========================================");


    }
}
public class BMI{
    public static void main(String[] args){
        ArrayList<Bmi> BmiArrayList= new ArrayList<>();
        BmiArrayList.add(new Bmi());
        for (Bmi obj:BmiArrayList) {
            obj.details();
            obj.calculation();
            obj.display();
        }
    }
}