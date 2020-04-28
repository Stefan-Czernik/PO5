
package testy;


public class Sekwencja {
    int [] arr;
    public Sekwencja(int [] arr){
        this.arr=arr;
    }
    public boolean sprawdzam (int [] arr){
        int dlugosc=arr.length;
        for (int x =0; x<dlugosc-2;x++){
            if (arr[x]==1&&arr[x+1]==2&&arr[x+2]==3){
                return true;
            }
        }
        return false;
     }
}
