class Mobile{
    String brand="samsung";
    double price;
    String color;
    String name;

    Mobile()   //no argument constructor 
    {
        System.out.println("Satart up instruction from no  argument constructpr"); //startup instruction from no argument constructor
    }

    public void displayMobile(){
        System.out.println("brand:"+(this.brand));
        System.out.println("price:"+(this.price));
        System.out.println("color:"+(this.color));
        System.out.println("name:"+(this.name));
    }
      
}