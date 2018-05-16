public class PetsOwner{
   public static void main(String[] args){
   Cat pet1=new Cat("Pearl","Maine coon");
   Rabbit pet2=new Rabbit("molly","Englis lop");
   
      System.out.println("The name of my cat is "+pet1.getName());
      System.out.println("The name of my rabbit is "+pet2.getName());
      pet1.sound();
      pet2.sound();
      pet1.feedingPattern();
      pet2.feedingPattern();
   }
}