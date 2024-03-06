public class UsaCompany extends Franchise{
    public ToyotaCars createPizza(String type){
        ToyotaCars toyotaCars = null;

        if(type.equals("UsaCamry")){
            toyotaCars = new UsaCamry();
        }else if(type.equals("UsaSupra")){
            toyotaCars = new UsaSupra();
        }
        return toyotaCars;
    }

}


