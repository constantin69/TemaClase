import java.util.*;
import java.util.stream.IntStream;

public class Main<capmediu, cap, c, putereMax, putere> {
    public static void main(String[] args) {

        int n = 20;
        int x;
        int X;
        int putereMax = 95;
        AparatFrigorific[] aparate = new AparatFrigorific[n];

        aparate[0] = new AparatFrigorific("Artic", 1500, 650);
        aparate[1] = new Frigider(10);
        aparate[2] = new Congelator(15);
        aparate[3] = new LadaFrigorifica(1500);
        aparate[4] = new FrigiderSidebySide(10);
        aparate[5] = new AparatFrigorific("Novatex ", 1650, 740);
        aparate[6] = new Frigider(15);
        aparate[7] = new Congelator(14);
        aparate[8] = new LadaFrigorifica(1650);
        aparate[9] = new FrigiderSidebySide(15);
        aparate[10] = new AparatFrigorific("Daewoo", 1450, 580);
        aparate[11] = new Frigider(12);
        aparate[12] = new Congelator(18);
        aparate[13] = new LadaFrigorifica(1600);
        aparate[14] = new FrigiderSidebySide(12);
        aparate[15] = new AparatFrigorific("Whirpool", 1550, 640);
        aparate[16] = new Frigider(10);
        aparate[17] = new Congelator(18);
        aparate[18] = new LadaFrigorifica(1850);
        aparate[19] = new AparatFrigorific("GoldStar", 1900, 920);

        for (int i = 0;i < n;i++) {
            aparate[i].listaAparate();
        }
        System.out.print("\n");


        int nrLazi = 0;
        int nrFrigidere = 0;
        for (int i = 0;i < n;i++) {
            //if (aparate[i] instanceof LadaFrigorifica) {
            if (aparate[i].getClass() == LadaFrigorifica) {
                nrLazi++;
            }
            //if ((aparate[i] instanceof Frigider) && !(aparate[i] instanceof FrigiderSidebySide)){
            if ((aparate[i].getClass() == Frigider) && !(aparate[i].getClass() == FrigiderSidebySide)){
                nrFrigidere++;
            }
        }

        System.out.println("Numarul de lazi frigorifice din sir este: " + nrLazi);
        System.out.print("\n");
        System.out.println("Numarul de frigidere din sir este: "+ nrFrigidere);
        System.out.print("\n");


        int j = 0;
        int p = 0;
        double mediu = 0.0;
        for (int i = 0;i < n;i++) {
            //if ((aparate[i] instanceof AparatFrigorific) && !(aparate[i] instanceof FrigiderSidebySide) && !(aparate[i] instanceof LadaFrigorifica) && !(aparate[i] instanceof Congelator)&& !(aparate[i] instanceof Frigider)){
            if (aparate[i].getClass() == AparatFrigorific){
                p += aparate[i].pret;
                j++;
            }
        }
        mediu = p / j;

        System.out.println("Pretul mediu al aparatelor frigorifice este : " + mediu);
        System.out.println();


        int c = 0;
        int cap = 0;
        int capmediu = 0;
        for (int i = 0;i < n;i++) {
            //if ((aparate[i] instanceof AparatFrigorific) && !(aparate[i] instanceof FrigiderSidebySide) && !(aparate[i] instanceof LadaFrigorifica) && !(aparate[i] instanceof Congelator)&& !(aparate[i] instanceof Frigider)){
            if (aparate[i].getClass() == AparatFrigorific) {
                cap += aparate[i].capacitate;
                c += 1;
            }
        }
        capmediu = cap / c;


        System.out.println("Capacitatea medie al aparatelor frigorifice este : " + capmediu + " W");
        System.out.println();


        System.out.print("Introduceti pretul minim :");
        x = new Scanner(System.in).nextInt();
        System.out.print("\n");
        System.out.print("Introduceti pretul maxim :");
        X = new Scanner(System.in).nextInt();
        System.out.print("\n");

        for (int i = 0;i < n;i++) {
            AparatFrigorific pretul;
            if (aparate[i].getClass() == AparatFrigorific) {
                pretul = aparate[i];
                if ((pretul.pret > x) && (pretul.pret < X)) {
                    System.out.println("Aparat frigorific are pretul de :" + pretul.pret);
                    //System.out.print("\n");
                }
            }
        }
        System.out.print("\n");


        int nrPutere = 0;
        for (int i = 0;i < n;i++) {
            if (aparate[i].getClass() == LadaFrigorifica) {
                if (aparate[i].putere > putereMax) {
                    System.out.println("Lada frigorifica cu puterea de " + aparate[i].putere + " W");
                    System.out.print("\n");
                    nrPutere++;
                }
            }

        }
        System.out.println("Numarul de lazi frigorifice cu puterea mai mare de " + putereMax + " W sunt: " + nrPutere + " lazi");
        System.out.print("\n");


    }
}
