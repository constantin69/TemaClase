public class Congelator extends  AparatFrigorific {
    int tempMin;

    Congelator() {
        tempMin = 0;
    }

    public Congelator(int tempMin){
        super();
        this.tempMin = tempMin;
    }

    public void listaAparate(){
        System.out.println("Congelatorul are temperatura minima - " + tempMin);
        //System.out.println("\n");
    }
}
