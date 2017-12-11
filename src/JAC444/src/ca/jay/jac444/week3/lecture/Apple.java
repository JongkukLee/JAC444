package ca.jay.jac444.week3.lecture;

abstract class Fruit { abstract public  void  name(); public float price() { return 0.0f; 
} 
} 
public class Apple extends Fruit {	 public static void  main(String  argv[])  { Apple e = new Apple(); e.name(); 
} 
 
public void name() { 
System.out.println("Honeycrips"); 
} 
 
public float price()  { return 10.0f; 
} 
} 
