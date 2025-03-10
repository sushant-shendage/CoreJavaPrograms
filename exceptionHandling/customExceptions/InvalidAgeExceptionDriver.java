// package exceptionHandling.customExceptions;

public class InvalidAgeExceptionDriver {
    public static void main(String[] args) {
        ageValidation(16);
    }
    static void ageValidation(int age){
        if (age >= 18) {
            System.out.println("valid age...!");
        } else {
            throw new InvalidAgeException();
        }
    }
}
class InvalidAgeException extends Exception{
    
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return  "Age must be equal or greter than 18..!";
    }
}