package e2y

import javax.inject.Named

@Named
class PersonC {
    public String Name
    public String Surname
    public int Data

    PersonC(){}

    @Override
    String toString(){

        return "Name: "+Name+", "+
                "Surname: "+Surname+", "+
                "Data: "+Data
    }
}
