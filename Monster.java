public class Monster
{
  private String myName;


  public Monster( String name ) {
      myName = name;
  }

  public String getName(){
    return myName;
  }

  public String party(){
    return myName + " invited a victim.  Slippery screams were heard.\n";
  }

  public String toString() {
     return "Monster name :: " + myName + "\n";
  }
}