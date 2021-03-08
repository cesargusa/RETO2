package Ecommerce.RETO2.Services.Models;

import java.util.List;

import Ecommerce.RETO2.Repositories.Entities.OrderEntity;

public class AllOrderDTO {
    public List<ProductCantidadDTO> productList;
    public OrderEntity order;

    public AllOrderDTO() {
    }

    public AllOrderDTO(List<ProductCantidadDTO> productList, OrderEntity order) {
        this.productList = productList;
        this.order = order;
    }

    public List<ProductCantidadDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductCantidadDTO> productList) {
        this.productList = productList;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    
}
