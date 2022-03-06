public class FrigiderSidebySide extends  Frigider {
    int rafturi;

    FrigiderSidebySide() {
        rafturi = 0;
    }

    public FrigiderSidebySide(int rafturi){
        super();
        this.rafturi = rafturi;
    }

    public void listaAparate(){
        System.out.println("Frigiderul are " + rafturi + " de rafturi ");
        //System.out.println("\n");
    }
}

