public class Main {
    public static void main(String[] args) {

        Franchise franchise = new UsaCompany();
        franchise.orderCar("UsaCamry");
        franchise.orderCar("UsaSupra");
        franchise.orderCar("UsaCorolla");

        Franchise franchise2 = new EuCompany();
        franchise2.orderCar("EuCamry");
        franchise2.orderCar("EuSupra");
        franchise2.orderCar("EuCorolla");

        Franchise franchise3 = new JapanCompany();
        franchise3.orderCar("JapanCamry");
        franchise3.orderCar("JapanSupra");
        franchise3.orderCar("JapanCorolla");

        //... is processed,
        //... is assembled,
        //... is packed
        // ready...
        // cost - 12000$ how it
    }
}