class Bikes{
    String fuel_type;
    int tyers;
    
}

class Cars extends Bikes{
    public void Info(){
        System.out.println(fuel_type);
        System.out.println(tyers);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cars obj = new Cars();
        obj.fuel_type = "Petrol";
        obj.Info();
    }
}
