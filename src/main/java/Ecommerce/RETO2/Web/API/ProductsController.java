package Ecommerce.RETO2.Web.API;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ecommerce.RETO2.Services.ProductsServices;
import Ecommerce.RETO2.Services.Models.ProductCantidadDTO;
import Ecommerce.RETO2.Services.Models.ProductDTO;

@RestController
@RequestMapping("/productsAPI")
public class ProductsController {
    private final ProductsServices productsServices;

    ProductsController(ProductsServices productsServices){
        this.productsServices=productsServices;
    }

    @GetMapping()
    public List<ProductDTO> GetAll(){
        return productsServices.GetAll();
    }
  
    @GetMapping("/{id}")
    public List<ProductDTO> GetId(@PathVariable("id") Long id){
        return productsServices.GetById(id);
    }
    @PostMapping
    public ProductDTO AddMovie(@RequestBody ProductDTO product){
        return productsServices.add(product);
    }
    
    @PutMapping("/{id}")
    public ProductDTO UpdateMovie(@RequestBody ProductDTO product, @PathVariable("id") Long id){
        return productsServices.update(id,product);
    }
    
    @DeleteMapping("/{id}")
    public void DeleteMovie(@PathVariable("id") Long id){
        productsServices.delete(id);

    }
    @GetMapping("/cantidad/{id}")
    public List<ProductCantidadDTO> GetCantidad(@PathVariable("id") Long id){
        return productsServices.findByOrderProduct(id);
    }
}