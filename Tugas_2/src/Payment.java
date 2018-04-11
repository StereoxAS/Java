package tugas2;


public class Payment {
   Menu menu = new Menu();
   public double total=0;
   
   Payment(){
   
   }
   public void getTotalBill(int index){
       total = total + menu.getMenuPrice();
   }
}
