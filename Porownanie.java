/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testy;

public class Porownanie {
    int pierwsza;
    int druga;
    public Porownanie(int pierwsza, int druga){
        this.pierwsza=pierwsza;
        this.druga=druga;
    }
    public static boolean test_last_digit(int pierwsza, int druga)
     {
	     return (pierwsza > 100 || druga > 100);
     }
}
