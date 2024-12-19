class Cloth {
     
        String kind;
        String origine;

        Cloth(String kind,String origine)
        {
            this.kind=kind;
            this.origine=origine;
        }
       void displayCloth()
        {
             System.out.println("kind :"+this.kind);
            System.out.println("origine:"+this.origine);
        }
    

}