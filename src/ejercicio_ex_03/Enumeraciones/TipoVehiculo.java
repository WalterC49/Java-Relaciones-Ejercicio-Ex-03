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
public enum TipoVehiculo {
    AUTO("Auto"),MOTO("Moto"),CAMION("Camión"),SEDAN("Sedán"),OTRO("Otro");
    
    private String valor;

    private TipoVehiculo() {
    }

    private TipoVehiculo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
