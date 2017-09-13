/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "numero")
@RequestScoped
public class Numero {
    int valor;
    String msg;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    private boolean ehPrimo(int num){
        boolean ret = false;
        if (num > 1)
        {
            ret = true;
            int index = 2;
            while (ret && index < num)
            {
                ret = (num % index != 0);
                index++;
            }
        }
        return ret;
    }
    
    public String getMsg(){
        
        if(ehPrimo(getValor())) {
            return " Valor é primo";
        } else {
           return " Valor não é primo";
        }
    }
}
