package Ecommerce.RETO2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Pedido") 
@Entity(name = "Pedido")
public class OrderEntity {
    private @Id @GeneratedValue Long id;
    private String fecha;
    private String nameUser;
    private String status;

    public OrderEntity(){

    }

    public OrderEntity(String fecha, String nameUser, String status) {
        this.fecha = fecha;
        this.nameUser = nameUser;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

}
