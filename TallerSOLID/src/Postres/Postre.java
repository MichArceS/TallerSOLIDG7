/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Postre{
	protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos=new ArrayList<>();

	public ArrayList<Aderezo> getAderezos() {

	    return aderezos;
    }
	
    public void anadirAderezo(
            Aderezo aderezo){

	    aderezos.add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        aderezos.remove(aderezo);
	}
	
	public double getPrecioParcial() {
		return precioParcial;
	}
}
