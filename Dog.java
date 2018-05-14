public class Dog extends Pet{
   private String breed;
   private String color;
   public Dog(String nameIn, String breedIn, String colorIn){
      super(nameIn);
      breed = breedIn;
      color = colorIn;
   }
   public void setBreed(String breedIn){
      breed = breedIn;
   }
   public String getBreed(){
      return breed;
   }
   public void setColor(String colorIn){
      color = colorIn;
   }
   public String getColor(){
      return color;
   }
   public void eat(){
      System.out.println("Wow my "+getBreed()+" "+getName()+" is eating");
   }
}