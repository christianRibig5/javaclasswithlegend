public  abstract class Pet{
   protected String name;
   public Pet(String nameIn){
      name= nameIn;
   }
  public void setName(String nameIn){
   name = nameIn;
  }
  public String getName(){
    return name;
  }
   public  abstract void eat();
}