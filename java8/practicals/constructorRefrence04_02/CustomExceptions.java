package javapgms.java8.practicals.random;

class MyClass extends Exception {
    public CustomExceptions(String chat);
}

interface CustomExceptions {

public static void main(){
    CustomExceptions c=CustomExceptions::new;

try{
throw c.creatCustomException(“This is my custom exception..!”);
}catch(Exception e){
e.printStack();
}
    }
}
