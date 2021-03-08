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

import Ecommerce.RETO2.Repositories.Entities.OrderEntity;
import Ecommerce.RETO2.Services.OrdersServices;
import Ecommerce.RETO2.Services.Models.OrderDTO;

@RestController
@RequestMapping("/ordersAPI")
public class OrderController {
    private final OrdersServices ordersService;

    OrderController(OrdersServices ordersService){
        this.ordersService=ordersService;
    }
    @GetMapping()
    public List<OrderDTO> GetAll(){
        return ordersService.GetAll();
    }
    @GetMapping("hola/{id}")
    public OrderEntity GetAllmas(@PathVariable("id") Long id){
        return ordersService.findByPedido(id);
    }
}