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

import Ecommerce.RETO2.Services.OrderProductServices;
import Ecommerce.RETO2.Services.Models.OrderProductDTO;


@RestController
@RequestMapping("/OrderProduct")
public class OrderProductController {
    private final OrderProductServices orderProductServices;

    OrderProductController(OrderProductServices orderProductServices){
        this.orderProductServices=orderProductServices;
    }

    @GetMapping()
    public List<OrderProductDTO> GetAll(){
        return orderProductServices.GetAll();
    }
   @GetMapping("/{id}")
    public List<OrderProductDTO> GetId(@PathVariable("id") Long id){
        return orderProductServices.GetById(id);
    } 
    
    @PostMapping
    public OrderProductDTO AddProductPedido(@RequestBody OrderProductDTO ProductPedido){
        return orderProductServices.add(ProductPedido);
    }
    
    @PutMapping("/{id}")
    public OrderProductDTO UpdateProductPedido(@RequestBody OrderProductDTO ProductPedido, @PathVariable("id") Long id){
        return orderProductServices.update(id,ProductPedido);
    }
    
    @DeleteMapping("/{id}")
    public void DeleteProductPedido(@PathVariable("id") Long id){
        orderProductServices.delete(id);

    }

}
