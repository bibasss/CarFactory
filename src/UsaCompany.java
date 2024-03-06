public class UsaCompany extends Franchise{
    public ToyotaCars CreateCar(String type){
        ToyotaCars toyotaCars = null;

        if(type.equals("UsaCamry")){
            toyotaCars = new UsaCamry();
        }else if(type.equals("UsaSupra")){
            toyotaCars = new UsaSupra();
        }else if(type.equals("UsaCorolla")){
            toyotaCars = new UsaCorolla();
        }
        return toyotaCars;
    }

}


