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

import java.util.ArrayList;

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
        ArrayList<Postre> arrPostres=new ArrayList<>();
        LecheEntera lecheDescremada= new LecheDescremada();
        ManejadorDeLeche mnjLeche= new ManejadorDeLeche();
        ManejadorPrecios mnjPrecios= new ManejadorPrecios();
        //Producir Helado
        Postre heladoVainilla=new Helado("Vainilla");
        arrPostres.add(heladoVainilla);

        //Producir Pastel
        Postre pastelChocolate= new Pastel("Chocolate");
        arrPostres.add(pastelChocolate);

        //Agregamos aderezos y cambiamos el tipo de leche
        for(Postre postre: arrPostres){
            postre.anadirAderezo(new Crema());              //agregamos el aderezo crema
            postre.anadirAderezo(new Frutilla());           //agregamos el aderezo frutilla
            System.out.println(postre);                     //imprimimos el postre
            mnjLeche.cambiarTipoLeche(lecheDescremada,postre);  //cambiamos el tipo de leche del postre
            System.out.println(mnjPrecios.showPrecioFinal(postre)); //imprimimos el precio del postre

        }

    }
}
