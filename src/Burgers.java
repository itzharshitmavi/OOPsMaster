public class Burgers extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;
    public Burgers(String name, double price){
        super("Burger", name, price);
    }
    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }
    @Override
    public double getAdjustedPrize() {
        return getBasePrize() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrize()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrize()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrize());
    }
    public double getExtraPrize(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }
    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Item("TOPPING", extra1, getExtraPrize(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPrize(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPrize(extra3));
    }
    public void printItemizedList(){
        printItem("BASE BURGER", getBasePrize());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }
    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
