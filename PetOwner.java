public class PetOwner{
   public static void main(String[]args){
         Pet pet = new Dog("Dog","German Shephered", "Black");
         System.out.println("My pet name is "+pet.getName());
         pet.eat();
   }
}