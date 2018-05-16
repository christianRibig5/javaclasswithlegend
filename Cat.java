public class Cat extends Pets{
   private String breed;
      public Cat(String namee, String breede){
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
      System.out.println("The feeding pattern of "+getName()+" whose breed is a "+getBreed()+" is obligate carnivores");
   }
   public void sound(){
      System.out.println("My "+getName()+" meows");
   }
}