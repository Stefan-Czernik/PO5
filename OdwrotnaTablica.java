
package testy;

public class OdwrotnaTablica {
    int [] tab;
    public OdwrotnaTablica(int [] tab){
        this.tab = tab;
    }
    public String odwroc(int[]tab){
        int dlugosc=tab.length;
        String nowa= "";
        for (int x=0; x<dlugosc; x++){
            nowa+=tab[dlugosc-x-1];
        }
        return nowa;
    }
    
    
}
