package PBOuas;

/**
 * Created by user on 07/07/2015.
 */

public class Main {

    public static void main(String[] args) {

        //Liga
        Liga inggris = new Liga("Inggris");
        Liga spanyol = new Liga("Spanyol");

        //Divisi
        Divisi bplA = new Divisi("Serie A",inggris);
        Divisi bplB = new Divisi("Serie B",inggris);
        Divisi bbva1 = new Divisi("Divisi1",spanyol);
        Divisi bbva2 = new Divisi("Divisi2",spanyol);

        //Klub
        Klub chelsea = new Klub("Chelsea",bplA,inggris);
        Klub united = new Klub("Mancester United",bplA,inggris);
        Klub liverpool = new Klub("Liverpool",bplB,inggris);
        Klub arsenal = new Klub("Arsenal",bplB,inggris);
        Klub real = new Klub("Real Madrid",bbva1,spanyol);
        Klub barca = new Klub("Barcelona",bbva1,spanyol);
        Klub villa = new Klub("Villareal",bbva2,spanyol);
        Klub espanyol = new Klub("Espanyol",bbva2,spanyol);

        inggris.setDaftarDivisi(bplA);
        inggris.setDaftarDivisi(bplB);
        spanyol.setDaftarDivisi(bbva1);
        spanyol.setDaftarDivisi(bbva2);

        bplA.setDaftarKlub(chelsea);
        bplA.setDaftarKlub(united);
        bplB.setDaftarKlub(liverpool);
        bplB.setDaftarKlub(arsenal);
        bbva1.setDaftarKlub(real);
        bbva1.setDaftarKlub(barca);
        bbva2.setDaftarKlub(villa);
        bbva2.setDaftarKlub(espanyol);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Inggris : ");
        inggris.getDaftarDivisi("Inggris");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Inggris : ");
        bplA.getDaftarKlubLiga("Inggris");
        System.out.println("Liga Spanyol : ");
        bbva1.getDaftarKlubLiga("Spanyol");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Barclays Premier League A : ");
        bplA.getDaftarKlubDivisi("Barclays Premier League A");
        System.out.println("Barclays Premier League B : ");
        bplB.getDaftarKlubDivisi("Barclays Premier League B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        united.getDivisi("Mancester United");
        arsenal.getDivisi("Arsenal");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        real.getLiga("Real Madrid");
    }
}