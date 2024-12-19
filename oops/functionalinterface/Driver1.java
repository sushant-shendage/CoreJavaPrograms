// package javapgms.oops.functionalinterface;
public class Driver1 {
    public static void main(String[] args) {
        
    }
}

 @FunctionalInterface
interface Demo1{
void m1();
}

@FunctionalInterface
interface Demo2{
void m1();
boolean equals(Object o);
}
// @FunctionalInterface
// interface Demo3{
// void m1();
// void m2();
// }
@FunctionalInterface
interface Demo4{
void m1();
 String toString();
}

@FunctionalInterface
interface Demo5{
void m1();
 int hashCode();
}

// @FunctionalInterface
// interface Demo6{
// void m1();
//  void finalize();
// }

// @FunctionalInterface
// interface Demo7{
// void m1();
//  void notify();
// }

// @FunctionalInterface
// interface Demo8{
// void m1();
//  Object clone();//as this is prefixed with protected
// }

// @FunctionalInterface
// interface Demo9{
// void m1();
//  Class getClass(); 
// }

// @FunctionalInterface
// interface Demo10{
//  void m1();
//  int hashCode();
//  String toString();
//  boolean equals();
// }
