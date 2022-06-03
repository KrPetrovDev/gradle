package e2y;

public class myNewUsername {

    public String Name;
    public String Surname;
    public int Data;

    public myNewUsername(){}

    @Override
    public String toString(){

        return "Name: "+Name+", "+
                "Surname: "+Surname+", "+
                "Data: "+Data;
    }
}
