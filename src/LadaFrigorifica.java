public class LadaFrigorifica extends  Congelator {
    int putere;

    LadaFrigorifica() {
        putere = 0;
    }

    public LadaFrigorifica(int putere){
        super();
        this.putere = putere;
    }

    public void listaAparate(){
        System.out.println("Lada frigorifica are o putere de " + putere + " W");
        //System.out.println("\n");
    }



}

