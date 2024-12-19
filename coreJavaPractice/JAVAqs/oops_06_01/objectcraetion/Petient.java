public class Petient {
    String first_name;
    String last_name;
    String city;
    String disease;
    
     Petient(String first_name,String last_name,String city,String disease)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.city=city;
        this.disease=disease;
    }
   
   void displayPetient()
    {
        System.out.println("first_name:"+(this.first_name));
        System.out.println("last_name:"+(this.last_name));
        System.out.println("city:"+(this.city));
        System.out.println("disease:"+(this.disease));
    }

    
    
}
