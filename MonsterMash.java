public class MonsterMash{
  public static void main(String[] args){

    Monster diddy = new Monster("Diddy");
    System.out.println(diddy);
    System.out.println(diddy.party());
    //System.out.println(diddy.getName());

    Monster west = new MC("Kayne of the West");
    System.out.println(west);
    System.out.println(west.party());

    LateNightShowHost jimmyFallon = new LateNightShowHost("Jimmy Fallon");
    System.out.println(jimmyFallon);
    System.out.println(jimmyFallon.party());
    System.out.println(jimmyFallon.gossip());

  }
}
