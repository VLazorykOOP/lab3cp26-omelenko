public class CoffeeFacade
{
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    CoffeeBuilder coffeeBuilder = new CoffeeBuilder();

    public void makeLatte(String c, int sugar, String syrup)
    {
        System.out.println("--- Facade: making Latte for client ---");

        coffeeMachine.pressButton();

        Coffee myCoffee = coffeeBuilder.setType("Latte")
                .addMilk()
                .addSugar(sugar)
                .setCup(c)
                .addSyrup(syrup)
                .build();

        myCoffee.info();

        System.out.println("--- Your order is ready! ---");
    }

    public void makeEspresso(String c, int sugar, String syrup)
    {
        System.out.println("--- Facade: making Espresso for client ---");

        coffeeMachine.pressButton();

        Coffee myCoffee = coffeeBuilder.setType("Espresso")
                .addSugar(sugar)
                .setCup(c)
                .addSyrup(syrup)
                .build();

        myCoffee.info();

        System.out.println("--- Your order is ready! ---");
    }
}
