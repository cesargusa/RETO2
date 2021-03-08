package Ecommerce.RETO2.Web.View;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.RETO2.Services.Models.OrderDTO;
import Ecommerce.RETO2.Web.API.OrderController;

@Controller
public class OrdersViewController {
    private final OrderController ordersController;

    OrdersViewController(OrderController ordersController){
        this.ordersController=ordersController;
   
    }
    //DEVUELVE TODOS LOS PRODUCTOS
    @GetMapping("/orders")
    public ModelAndView Orders(){
     List<OrderDTO> ord = ordersController.GetAll();
     ModelAndView mv = new ModelAndView("orders");
     mv.addObject("orders", ord);
     return mv;
    }
    @GetMapping("/orders/new")
    public ModelAndView CreateOrder(){
        ModelAndView mv = new ModelAndView("addOrder");
        mv.addObject("order", new OrderDTO());
        return mv;
    }
    @PostMapping("/orderCreate")
    public String Add(@ModelAttribute("order") OrderDTO newOrder){
       ordersController.AddOrder(newOrder);
        return "redirect:/orders";
    }
}
