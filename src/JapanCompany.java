public class JapanCompany extends Franchise{
    public ToyotaCars createPizza(String type){
        ToyotaCars toyotaCars = null;

        if(type.equals("JapanCamry")){
            toyotaCars = new JapanCamry();
        }else if(type.equals("JapanSupra")){
            toyotaCars = new JapanSupra();
        }
        return toyotaCars;
    }

}