
//create a class Item
   class Item {
   //private instances are created
   private int itemCode;
   private String itemName;
   private double price;
   //using getter and setter method
   public int getItemCode() {
       return itemCode;
   }
   public void setItemCode(int itemCode) {
       this.itemCode = itemCode;
   }
   public String getItemName() {
       return itemName;
   }
   public void setItemName(String itemName) {
       this.itemName = itemName;
   }
   public double getPrice() {
       return price;
   }
   public void setPrice(double price) {
       this.price = price;
   }
   //method to display details of item
   public void display(int quantity){
       double total = getPrice() * quantity;
       System.out.println("ItemCode "+ getItemCode());
       System.out.println("ItemName "+ getItemName());
       System.out.println("ItemPrice "+ getPrice());
       System.out.println("TotalPrice will be "+ total);
   }
}
//public class ItemMain
public class ItemMain {
   //main method
   public static void main(String[] args) {
       //scanner object created
       Scanner sc = new Scanner(System.in);
       //create a object of Item class
       Item i = new Item();
       System.out.println("Enter ItemCode, ItemName, ItemPrice ");
       //Enter the details
       int itemCode = sc.nextInt();
       String itemName = sc.nextLine();
       sc.nextLine();
       double price = sc.nextDouble();
       //Enter quantity
       System.out.println("Enter quantity ");
       int quantity = sc.nextInt();
       //set the values
       i.setItemCode(itemCode);
       i.setItemName(itemName);
       i.setPrice(price);
       i.display(quantity);
   }
}