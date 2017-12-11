package ca.jay.jac444.week3.lecture;

class Dog { public void bark() { 
System.out.println("Dog - bark - "); } 
} 
 
class MyDog extends  Dog  { public void bark()  { 
String s1 = new String("woofer"); String s2  =  new  String("woofer"); if  ( s1 == s2) 
    System.out.println("Same  "); if (s1.equals(s2)) 
    System.out.println("Equals "); 
 
System.out.println("woofer - bark -  "); } 
} 
 
public class Bark { 
public static void  main(String  args[])  { 
Dog woofer  = new Dog(); Dog nipper = new MyDog(); woofer.bark(); nipper.bark(); 
} 
  } 
