/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Postres.Postre;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorPrecios{
    
    public static double calcularPrecioFinal(Postre p){
        double precioFinal;
		double precioParcial = p.getPrecioParcial();
        precioFinal=(precioParcial+(precioParcial*0.12))+(p.getAderezos().size()*0.50);
        return precioFinal;
    }
    
    public static String showPrecioFinal(Postre p){
        return "Precio Final: $ " + calcularPrecioFinal(p);
    }
    
}
