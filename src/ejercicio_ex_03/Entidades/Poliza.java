/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ex_03.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Walter
 */
public class Poliza {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer numeroPoliza;
    private LocalDate inicioPoliza;
    private LocalDate finPoliza;
    private ArrayList<Cuota> cantidadCuotas;
    private String formaDePago;
    private Float montoAsegurado;
    private Boolean granizo;
    private Float montoGranizo;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer numeroPoliza, LocalDate inicioPoliza, LocalDate finPoliza, ArrayList<Cuota> cantidadCuotas, String formaDePago, Float montoAsegurado, Boolean granizo, Float montoGranizo, String tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroPoliza = numeroPoliza;
        this.inicioPoliza = inicioPoliza;
        this.finPoliza = finPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.formaDePago = formaDePago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getInicioPoliza() {
        return inicioPoliza;
    }

    public void setInicioPoliza(LocalDate inicioPoliza) {
        this.inicioPoliza = inicioPoliza;
    }

    public LocalDate getFinPoliza() {
        return finPoliza;
    }

    public void setFinPoliza(LocalDate finPoliza) {
        this.finPoliza = finPoliza;
    }

    public ArrayList<Cuota> getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(ArrayList<Cuota> cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Float getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Float montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public Float getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Float montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", numeroPoliza=" + numeroPoliza + ", inicioPoliza=" + inicioPoliza + ", finPoliza=" + finPoliza + ", cantidadCuotas=" + cantidadCuotas + ", formaDePago=" + formaDePago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
}
