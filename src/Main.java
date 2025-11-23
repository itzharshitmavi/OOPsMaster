public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();
//        System.out.println("\n");
//
//        Burgers burger =  new Burgers("regular", 4.0);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();
//        System.out.println("\n");
//
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();
//        System.out.println("\n");
//
//        MealOrder secondOrder = new MealOrder("turkey", "7-up", "chili");
//        secondOrder.addBurgerToppings("LETTUCE", "CHEESE", "HAM");
//        secondOrder.setDrinkSize("MEDIUM");
//        secondOrder.printItemizedList();

//        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili" );
//        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
//        deluxeMeal.setDrinkSize("MEDIUM");
//        deluxeMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "thumbs-up", "french fries");
        deluxeMeal.addBurgerToppings("PATTIES", "CHEESE", "MAYO", "BACON", "AVCADO");
        deluxeMeal.setDrinkSize("MEDIUM");
        deluxeMeal.printItemizedList();
    }
}
