public class Main {
    public static void main(String[] args) {
        System.out.println("Interface Eksempel");
        FIrePokemon pikachu = new FIrePokemon();
        pikachu.setNavn("Pikachu");
        pikachu.setKoen("Han");
        pikachu.setSkade((short) 80);
        pikachu.setNummerPokedex(25);

        System.out.println(pikachu.toString());;
        pikachu.spyIld();
    }
}
