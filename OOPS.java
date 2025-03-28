public class OOPS {
  public static void main(String args[]){
    Calculator calc = new Calculator();
    System.out.println(calc.sum((float)1.5, (float)2.5));
    System.out.println(calc.sum(1, 2, 3));

  }
}
 class Calculator{
    int sum(int a, int b){
        return a+b;

    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
 }
    // public static void main(String args[]){
    //     Dog dobby = new Dog();
    //     dobby.eat();
    //     System.out.println(dobby.legs);

    //    class Animal{
    //     String color;
    //     void eat(){
    //         System.out.println("eats");
    //     }
    //     void breathe(){
    //         System.out.println("breaths");
    //     }
    //    } 
    //    class Mammal extends Animal{
    //     void walk(){
    //         System.out.println("walks");
    //     }
    //    }
    //  class Fish extends Animal{
    //     void swim(){
    //         System.out.println("swim");

    //     }

    //     }
    //     class Bird extends Animal{
    //         void fly(){
    //             System.out.println("fly");
    //         }
    //     }

        // Fish shark = new Fish();
        // shark.eat();
        // // Pen p1 = new Pen(); 
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("yellow");
        // System.out.println(p1.getColor());
        // BankAccount myAcc = new BankAccount();
        // Student s1 = new Student("puttan");
        // s1.name = "puttan";
        // s1.roll = 456;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // Student s2 = new Student(s1);
        // s2.password = "xyz";
       
    


//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
        

//     }
//     Student(String name){
//         this.name = name;
//     }
//     Student (int roll){
//         this.roll = roll;
//     }
// }
//  class BankAccount{
//      private String  username;
//      private String password;
//      public void setPassword(String pwd){
//         password = pwd;
//     //     Student s1 = new Student();
//     //     System.out.println(s1.name);
//     // }
//  }
 
  
// class Pen{
//      private String color;
//     private int tip;
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setColor(String newColor){
//         this.color = newColor;
//     }

//     void setTip(int newTip){
//         this.tip = newTip;
//     }
// }
// class S1{
//     String name;
//     int age;
//     float percantage;

//     void calcPercentage(int phy, int chem, int math){
//         percantage = (phy + chem + math) /3;

   
//     }
// }
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}}

//     class Mammal extends Animal{
//         int legs;
//     }
//     class Dog extends Mammal{
//         String breed;

//     }

// }
