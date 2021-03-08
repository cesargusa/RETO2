package Ecommerce.RETO2.Services.Models;

public class OrderDTO {
    private Long id;
    private String fecha;
    private String nameUser;
    private String status;
    
    public OrderDTO(){}

    public OrderDTO(Long id, String fecha, String nameUser, String status) {
        this.id = id;
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

    public OrderDTO(String fecha, String nameUser, String status) {
        this.fecha = fecha;
        this.nameUser = nameUser;
        this.status = status;
    }

   
    
}
