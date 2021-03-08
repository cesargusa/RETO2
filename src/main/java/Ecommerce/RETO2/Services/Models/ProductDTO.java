package Ecommerce.RETO2.Services.Models;

public class ProductDTO {
    private Long id;
    private String name;
    private String price;
    private String url;


    public ProductDTO(){}
    
    public ProductDTO(Long id, String name, String price, String url) {
        this.id = id;
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
