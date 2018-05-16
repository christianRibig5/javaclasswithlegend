public class Rabbit extends Pets{
   private String breed;
      public Rabbit(String namee, String breede){
         super(namee);
         breed=breede;
      }
   public void setBreed(String breede){
      breed=breede;
   }
   public String getBreed(){
      return breed;
   }
   public void feedingPattern(){
      System.out.println("The feeding pattern of "+getName()+" whose breed is a "+getBreed()+" is herbivores");
   }
   public void sound(){
      System.out.println("My "+getName()+" squeaking");
   }
}