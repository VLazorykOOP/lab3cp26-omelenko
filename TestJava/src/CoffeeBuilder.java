public class CoffeeBuilder {
    private final Coffee coffee;
    CoffeeBuilder() { coffee = new Coffee(); }
    public CoffeeBuilder setType(String t) { coffee.setType(t); return this; }
    public CoffeeBuilder addSugar(int s) { coffee.setSugar(s); return this; }
    public CoffeeBuilder setCup(String c) { coffee.setCupType(CupType.valueOf(c)); return this; }
    public CoffeeBuilder addMilk() { coffee.setMilk(true); return this; }
    public CoffeeBuilder addSyrup(String s) {coffee.setSyrup(s); return this; }
    public Coffee build() {return coffee;}
}
