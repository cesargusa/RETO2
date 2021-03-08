package Ecommerce.RETO2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Product")
@Table(name = "Product")
public class ProductEntity{
    private @Id  @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
    private String name;
    private String price;
    private String url;
    
    public ProductEntity(){

    }

    public ProductEntity(String name, String price, String url) {
        this.name = name;
        this.price = price;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
