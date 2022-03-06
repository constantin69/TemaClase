public class Frigider extends AparatFrigorific{
    int rafturi;

    Frigider() {
        rafturi = 0;
    }

    public Frigider(int rafturi){
    //public Frigider(int rafturi){
        super();
        this.rafturi = rafturi;
    }

    public void listaAparate(){
        System.out.println("Numar de rafturi " + rafturi);
        //System.out.println("\n");
    }

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
}
