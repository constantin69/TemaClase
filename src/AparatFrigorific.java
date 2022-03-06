public class AparatFrigorific {
    public String producator;
    public int capacitate;
    public int pret;
    int putere;

    AparatFrigorific() {
    }

    public AparatFrigorific(String producator, int capacitate, int pret){
        this.producator = producator;
        this.capacitate = capacitate;
        this.pret = pret;
    }


    /*
    public void dispose()
    {
        if (producator != null) {producator = null;}
    }
    */


    public void listaAparate(){
        System.out.println("Aparat frigorific este produs de "+ producator+ " are capacitatea de "+ capacitate + " Litri si are pretul de " + pret + " RON");
        //System.out.println("\n");
    }


    public static double pretMediu(AparatFrigorific[] aparate, int n) {
        int j = 0;
        int p = 0;
        double mediu = 0.0;
        for (int i = 0;i < n;i++) {
            if ((aparate[i] instanceof AparatFrigorific) && !(aparate[i] instanceof FrigiderSidebySide) && !(aparate[i] instanceof LadaFrigorifica) && !(aparate[i] instanceof Congelator)&& !(aparate[i] instanceof Frigider)){
                p += aparate[i].pret;
                j += 1;
            }
        }
        mediu = p / j;
        return mediu;
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

    public float capacitateaMedie(AparatFrigorific[] aparate, int n) {
        int j = 0;
        int cap = 0;
        float capmediu = 0;
        for (int i = 0;i < n;i++) {
            if (aparate[i] instanceof AparatFrigorific){
                cap += aparate[i].capacitate;
                j += 1;
            }
        }
        capmediu = cap / j;
        return capmediu;
    }*/
}
