public class DoceDeLeite extends MenuComponent
{
   public DoceDeLeite(){        
   }
    
   public String getName(){
       return "DoceDeLeite";
   }
    
   public String getDescription(){
       return "caseiro";
   }
    
   public double getPrice(){
       return 8;
   }
        
   public String toString(){
       return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
   }
    
   public void print(){
       System.out.print("#  "+getName());
       if(isVegetarian()){
           System.out.print("(v)");
       }
       
       System.out.print(", "+getPrice());
       System.out.print("     --  "+getDescription());
   }
}
