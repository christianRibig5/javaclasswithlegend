public abstract class Pets{
   private String name;
   
   public Pet(String namee){
      name=namee;
   }
   public void setName(String namee){
      name=namee;
   }
   public String getName(){
      return name;
   }
    
   public abstract void sound();
   
}