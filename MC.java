public class MC extends Monster{

    public MC(String name) {
        //super is new syntax that calls the parent method
       super(name);
    }

    //Override the party(0 method we inherited from Monster
    //  Must have the same name, same return type, same parameter(s)

    public String party(){
        //System.out.println(super.party());
        return "The doctor...im not gonna say...he was a jewish doctor";
    }
    
}
