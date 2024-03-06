public abstract class Franchise {
    public abstract ToyotaCars createPizza(String type);
    public final ToyotaCars orderPizza(String type){

        ToyotaCars toyotaCars = this.createPizza(type);
        toyotaCars.processed();
        toyotaCars.assembled();
        toyotaCars.packed();
        toyotaCars.ready();
        return toyotaCars;
    }
}
