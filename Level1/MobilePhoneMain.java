
//create a class MobilePhone
   class MobilePhone {
   //create a class MobilePhone
   private String brand;
   private String model;
   private double price;
   //getters and setters methods to get and fetch values
   public String getBrand() {
       return brand;
   }

   public void setBrand(String brand) {
       this.brand = brand;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public double getPrice() {
       return price;
   }

   public void setPrice(double price) {
       this.price = price;
   }
   //method to display details
   public void display(){
       System.out.println("Brand name is "+ getBrand());
       System.out.println("Model name is "+ getModel());
       System.out.println("Price is "+ getPrice());
   }
}

public class MobilePhoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m = new MobilePhone();
        System.out.println("Enter brand, model and price of MobilePhone");
        String brand = sc.nextLine();
        String model = sc.nextLine();
        double price = sc.nextDouble();
        m.setBrand(brand);
        m.setModel(model);
        m.setPrice(price);
        m.display();

    }
}

