public abstract class Franchise {
    public abstract ToyotaCars CreateCar(String type);
    public final ToyotaCars orderCar(String type){

        ToyotaCars toyotaCars = this.CreateCar(type);
        toyotaCars.processed();
        toyotaCars.assembled();
        toyotaCars.packed();
        toyotaCars.ready();
        toyotaCars.end();
        return toyotaCars;
    }
}
