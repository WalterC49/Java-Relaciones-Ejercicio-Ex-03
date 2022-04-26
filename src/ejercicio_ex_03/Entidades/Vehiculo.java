/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ex_03.Entidades;

import ejercicio_ex_03.Enumeraciones.TipoChasis;
import ejercicio_ex_03.Enumeraciones.TipoVehiculo;

/**
 *
 * @author Walter
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;
    private String numeroMotor;
    private TipoChasis chasis;
    private String color;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, String numeroMotor, TipoChasis chasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public TipoChasis getChasis() {
        return chasis;
    }

    public void setChasis(TipoChasis chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
}
