package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductInvoicePK implements Serializable {
    @Column(name = "id_product")
    private Long idproduct;
    @Column(name = "id_invoice")
    private Long idinvoice;

    public ProductInvoicePK() {
    }

    public Long getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Long idproduct) {
        this.idproduct = idproduct;
    }

    public Long getIdinvoice() {
        return idinvoice;
    }

    public void setIdinvoice(Long idinvoice) {
        this.idinvoice = idinvoice;
    }

}
