public class Mousse extends MenuComponent
{
   public Mousse(){        
   }
    
   public String getName(){
       return "Mousse";
   }
    
   public String getDescription(){
       return "de maracujá";
   }
    
   public double getPrice(){
       return 5;
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
