/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl na VŠE ďábelské ódy. */
package cz.vse.vitj07.adventura;

import cz.vse.vitj07.adventura.logika.Hra;
import cz.vse.vitj07.adventura.logika.IHra;
import cz.vse.vitj07.adventura.uiText.TextoveRozhrani;


/*******************************************************************************
 * Třída  Start je hlavní třídou projektu,
 * který představuje jednoduchou textovou adventuru určenou k dalším úpravám a rozšiřování
 *
 * @author    Jan Vítů
 * @version   LS rok 2019
 */
public class Main
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        IHra hra = new Hra();
        TextoveRozhrani ui = new TextoveRozhrani(hra);

        if(args.length > 0){    //délka parametru4
            ui.hraj();         //délka větší než nula
        }
        else{               //když tam parametr není, spustí se to normálním způsobem
            ui.hraj();
        }
    }

    private Main(){}
}
