package Ecommerce.RETO2.Services.Models;

import Ecommerce.RETO2.Repositories.Entities.ProductEntity;

public class ProductCantidadDTO {
    private ProductEntity product;
    private int cantidad;

    

    public ProductCantidadDTO(ProductEntity product, int cantidad) {
        this.product = product;
        this.cantidad = cantidad;
    }

    public ProductCantidadDTO() {
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
