public abstract class ToyotaCars {
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void processed(){
        System.out.println(description+" is processed...");
    }

    public void assembled(){
        System.out.println(description+ " is assembled...");
    }
    public void packed(){
        System.out.println(description+" is packed...");
    }
    public void ready(){
        System.out.println(description+" ready! \n");
    }
}
