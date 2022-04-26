/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ex_03.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Walter
 */
public class Cuota {
    private Integer numeroCuota;
    private Float monto;
    private Boolean pagada;
    private LocalDate fechaVencimiento;
    private String formaDePago;

    public Cuota() {
    }

    public Cuota(Integer numeroCuota, Float monto, Boolean pagada, LocalDate fechaVencimiento, String formaDePago) {
        this.numeroCuota = numeroCuota;
        this.monto = monto;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", monto=" + monto + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaDePago=" + formaDePago + '}';
    }
}
