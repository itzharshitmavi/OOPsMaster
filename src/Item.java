public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }
    public String getName(){
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
    }
        return name;
    }
    public double getBasePrize(){
        return price;
    }
    public double getAdjustedPrize(){
        return switch(size){
            case "SMALL" -> getBasePrize() - 0.5;
            case "LARGE" -> getBasePrize() + 1;
            default -> getBasePrize();
        };
    }
    public void setSize(String size){
        this.size = size;
    }
    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }
    public void printItem(){
        printItem(getName(), getAdjustedPrize());
    }
}
