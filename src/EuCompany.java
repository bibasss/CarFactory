public class EuCompany extends Franchise{
    public ToyotaCars CreateCar(String type){
        ToyotaCars toyotaCars = null;

        if(type.equals("EuCamry")){
            toyotaCars = new EuCamry();
        }else if(type.equals("EuSupra")){
            toyotaCars = new EuSupra();
        }else if(type.equals("EuCorolla")){
            toyotaCars = new EuCorolla();
        }
        return toyotaCars;
    }

}
