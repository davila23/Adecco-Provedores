// 
// Decompiled by Procyon v0.5.36
// 

package ar.com.adecco.proveedores.model;

import javax.persistence.JoinColumn;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity(name = "ar.com.adecco.proveedores.model.NotaDebito")
@DiscriminatorValue("ND")
public class NotaDebito extends Comprobante implements Serializable
{
    private static final long serialVersionUID = -66858120699873457L;
    private Factura facturaAplicada;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FACTURAAPLICADA_ID")
    public Factura getFacturaAplicada() {
        return this.facturaAplicada;
    }
    
    public void setFacturaAplicada(final Factura facturaAplicada) {
        this.facturaAplicada = facturaAplicada;
    }
}
