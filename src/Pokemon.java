public class Pokemon {
    private String navn, koen, udviklesFra, udviklesTil;
    private int nummerPokedex;
    private short skade;

    public Pokemon() {}

    public Boolean angreb() {
        return false;
    }

    @Override
    public String toString() {
        String beskrivelse = "Pokemon " +
                navn + " er nr. " +
                nummerPokedex + " og er en " +
                koen;
        return beskrivelse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKoen() {
        return koen;
    }

    public void setKoen(String koen) {
        this.koen = koen;
    }

    public String getUdviklesFra() {
        return udviklesFra;
    }

    public void setUdviklesFra(String udviklesFra) {
        this.udviklesFra = udviklesFra;
    }

    public String getUdviklesTil() {
        return udviklesTil;
    }

    public void setUdviklesTil(String udviklesTil) {
        this.udviklesTil = udviklesTil;
    }

    public int getNummerPokedex() {
        return nummerPokedex;
    }

    public void setNummerPokedex(int nummerPokedex) {
        this.nummerPokedex = nummerPokedex;
    }

    public short getSkade() {
        return skade;
    }

    public void setSkade(short skade) {
        this.skade = skade;
    }



}
