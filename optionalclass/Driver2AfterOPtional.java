// package javapgms.optionalclass;

import java.util.Optional;

public class Driver2AfterOPtional {
    public static void main(String[] args) {
        String inputString = null;
        Optional<String> op1 = Optional.ofNullable(inputString);
        System.out.println(op1);

        // if (op1.isPresent()) {
        //     System.out.println("data is present..!");
        // }else{
        //     System.out.println("data is not present..!");  
        // }

        if (op1.get()!=null) {
            System.out.println("data is got..!");
        }else{
            System.out.println("data is not present..!");  
        }
    }
}
