/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        /* Producir un helado de vainilla y una torta de chocolate,
         * a ambos agregarles CREMA y FRUTILLAS
         * y cambiar el tipo de leche por Leche Descremada
         * Finalmente mostrar el precio final de cada uno */

        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        ManejadorPrecios mnj_precio= new ManejadorPrecios();
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        helado_vainilla.anadirAderezo(new Crema());         //Se añade el aderezo Crema
        helado_vainilla.anadirAderezo(new Frutilla());      //Se añade el aderezo Frutilla
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla); //Se cambia el tipo de leche
        System.out.println(ManejadorPrecios.showPrecioFinal(helado_vainilla));

        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.anadirAderezo(new Frutilla());     //se añade el aderezo frutilla
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate); //se cambia el tipo de leche
        System.out.println();
        System.out.println(ManejadorPrecios.showPrecioFinal(pastel_chocolate));

        
    }
}
