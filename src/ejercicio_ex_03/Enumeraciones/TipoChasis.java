/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ex_03.Enumeraciones;

/**
 *
 * @author Walter
 */
public enum TipoChasis {
    INDEPENDIENTE("Independiente"),AUTOPORTANTE("Autoportante");
    
    private String valor;
    
    private TipoChasis(){
    }
    
    private TipoChasis(String valor){
        this.valor=valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
