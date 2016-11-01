package com.movil.tesis.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by mac on 10/31/16.
 */
@Entity
public class ProductosYanbal {
    private Integer codigo;
    private Integer codigoRapido;
    private String nombreProducto;
    private BigDecimal valor;
    private Integer disponible;
    private Integer stock;

    @Id
    @Column(name = "codigo", nullable = true)
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "codigoRapido", nullable = true)
    public Integer getCodigoRapido() {
        return codigoRapido;
    }

    public void setCodigoRapido(Integer codigoRapido) {
        this.codigoRapido = codigoRapido;
    }

    @Basic
    @Column(name = "nombreProducto", nullable = true, length = 255)
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Basic
    @Column(name = "valor", nullable = true, precision = 2)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "disponible", nullable = true)
    public Integer getDisponible() {
        return disponible;
    }

    public void setDisponible(Integer disponible) {
        this.disponible = disponible;
    }

    @Basic
    @Column(name = "stock", nullable = true)
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductosYanbal that = (ProductosYanbal) o;

        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (codigoRapido != null ? !codigoRapido.equals(that.codigoRapido) : that.codigoRapido != null) return false;
        if (nombreProducto != null ? !nombreProducto.equals(that.nombreProducto) : that.nombreProducto != null)
            return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (disponible != null ? !disponible.equals(that.disponible) : that.disponible != null) return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo != null ? codigo.hashCode() : 0;
        result = 31 * result + (codigoRapido != null ? codigoRapido.hashCode() : 0);
        result = 31 * result + (nombreProducto != null ? nombreProducto.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (disponible != null ? disponible.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        return result;
    }
}
