package Ecommerce.RETO2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name = "OrderProduct")
@Table(name = "OrderProduct")

public class OrderProductEntity {
    private  @Id     @GeneratedValue(strategy=GenerationType.IDENTITY)    Long id;
    private Long productId;
    private Long pedidoId;
    private int cantidad;

    public OrderProductEntity() {
    }

    public OrderProductEntity(Long productId, Long pedidoId, int cantidad) {

        this.productId = productId;
        this.pedidoId = pedidoId;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

  
    
}
