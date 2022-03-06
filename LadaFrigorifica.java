public class LadaFrigorifica extends  Congelator {
    int putere;
    int putereMax = 95;

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

    /*
    public float capacitateaMedie(AparatFrigorific[] aparate, int n) {
        int j = 0;
        int cap = 0;
        float capmediu = 0;
        for (int i = 0;i < n;i++) {
            if (aparate[i] instanceof Frigider){
                cap += aparate[i].capacitate;
                j += 1;
            }
        }
        capmediu = cap / j;
        return capmediu;
    }

    public static int nrPutere {
        int nrPutere = 0;
        int putereMax =95;
        LadaFrigorifica[] put = new LadaFrigorifica[];
        for (int i = 0; i < n; i++) {
            if (put[i].putere > putereMax) {
                    System.out.println("Lada frigorifica cu puterea de " + put[i].putere + " W");
                    System.out.print("\n");
                    nrPutere++;
                }
        }
        return nrPutere;
    }
     */
}



