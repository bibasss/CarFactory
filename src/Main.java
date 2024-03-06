public class Main {
    public static void main(String[] args) {


        //... is processed,
        //... is assembled,
        //... is packed
        // ready...
        // cost - 12000$

        Franchise franchise = new UsaCompany();
        franchise.orderPizza("UsaCamry");
        franchise.orderPizza("UsaSupra");

        Franchise franchise2 = new EuCompany();
        franchise2.orderPizza("EuCamry");
        franchise2.orderPizza("EuSupra");

        Franchise franchise3 = new JapanCompany();
        franchise3.orderPizza("JapanCamry");
        franchise3.orderPizza("JapanSupra");

    }
}