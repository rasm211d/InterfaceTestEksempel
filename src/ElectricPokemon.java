public class ElectricPokemon extends Pokemon implements EX, CanFly{
    public void givStod() {
        System.out.println("WHOUAAAAA");
    }
    @Override
    public void ex() {

    }

    @Override
    public void fly() {
        System.out.println("Jeg bruger min elektricitet til at flyve");

    }
}
