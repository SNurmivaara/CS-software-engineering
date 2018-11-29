
package ohtu.intjoukkosovellus;

public class IntJoukko {

    public final static int KAPASITEETTI = 5, // aloitustalukon koko
                            OLETUSKASVATUS = 5;  // luotava uusi taulukko on näin paljon isompi kuin vanha
    private int kasvatuskoko;
    private int[] taulukko;      // Joukon luvut säilytetään taulukon alkupäässä.
    private int alkioidenLkm;    // Tyhjässä joukossa alkioiden_määrä on nolla. 

    public IntJoukko() {
        taulukko = new int[KAPASITEETTI];
        alkioidenLkm = 0;
        kasvatuskoko = OLETUSKASVATUS;
    }

    public IntJoukko(int kapasiteetti) {
        if (kapasiteetti < 0) throw new IndexOutOfBoundsException("Kapasiteetti negatiivinen!");
        taulukko = new int[kapasiteetti];
        alkioidenLkm = 0;
        kasvatuskoko = OLETUSKASVATUS;
    }
    
    
    public IntJoukko(int kapasiteetti, int kasvatuskoko) {
        if (kapasiteetti < 0 || kasvatuskoko < 0) throw new IndexOutOfBoundsException("Kapasitteetti tai kasvatuskoko negatiivinen");
        taulukko = new int[kapasiteetti];
        alkioidenLkm = 0;
        this.kasvatuskoko = kasvatuskoko;
    }

    public boolean lisaa(int luku) {
        if (kuuluu(luku)) return false;
        if (alkioidenLkm < taulukko.length) {
            taulukko[alkioidenLkm] = luku;
            alkioidenLkm++;
            return true;
        } else {
            kasvataTaulukko();
            lisaa(luku);
        }
        return false;
    }

    public boolean kuuluu(int luku) {
        for (int i = 0; i < alkioidenLkm; i++) {
            if (luku == taulukko[i]) return true;
        }
        return false;
    }

    public boolean poista(int luku) {
        if (kuuluu(luku)) {
            for (int i = 0; i < taulukko.length -1; i++) {
                if (taulukko[i] == luku) {
                    for (int j = i; j < alkioidenLkm-1; j++) {
                        taulukko[j] = taulukko[j+1];
                    }
                    alkioidenLkm--;
                }
            }
            return true;
        }
        return false;
    }

    private void kasvataTaulukko(){
        int[] uusiTaulukko = new int[taulukko.length+kasvatuskoko];
        for (int i = 0; i < taulukko.length; i++) {
            uusiTaulukko[i] = taulukko[i];
        }
        taulukko = uusiTaulukko;
    }

    public int mahtavuus() {
        return alkioidenLkm;
    }


    @Override
    public String toString() {
        if (alkioidenLkm == 0) {
            return "{}";
        } else if (alkioidenLkm == 1) {
            return "{" + taulukko[0] + "}";
        } else {
            String tuotos = "{";
            for (int i = 0; i < alkioidenLkm - 1; i++) {
                tuotos += taulukko[i];
                tuotos += ", ";
            }
            tuotos += taulukko[alkioidenLkm - 1];
            tuotos += "}";
            return tuotos;
        }
    }

    public int[] toIntArray() {
        int[] taulu = new int[alkioidenLkm];
        for (int i = 0; i < taulu.length; i++) {
            taulu[i] = taulukko[i];
        }
        return taulu;
    }
   

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        IntJoukko x = new IntJoukko();
        int[] aTaulu = a.toIntArray();
        int[] bTaulu = b.toIntArray();
        for (int i = 0; i < aTaulu.length; i++) {
            x.lisaa(aTaulu[i]);
        }
        for (int i = 0; i < bTaulu.length; i++) {
            x.lisaa(bTaulu[i]);
        }
        return x;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        IntJoukko y = new IntJoukko();
        int[] aTaulu = a.toIntArray();
        int[] bTaulu = b.toIntArray();
        for (int i = 0; i < aTaulu.length; i++) {
            for (int j = 0; j < bTaulu.length; j++) {
                if (aTaulu[i] == bTaulu[j]) {
                    y.lisaa(bTaulu[j]);
                }
            }
        }
        return y;
    }
    
    public static IntJoukko erotus ( IntJoukko a, IntJoukko b) {
        IntJoukko z = yhdiste(a, b);
        for (int i = 0; i < b.taulukko.length; i++) {
            z.poista(i);
        }
        return z;
    }
        
}