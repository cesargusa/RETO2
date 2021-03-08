package Ecommerce.RETO2.Web.View;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.RETO2.Services.OrderProductServices;
import Ecommerce.RETO2.Services.OrdersServices;
import Ecommerce.RETO2.Services.Models.AllOrderDTO;
import Ecommerce.RETO2.Services.Models.OrderProductDTO;
import Ecommerce.RETO2.Web.API.OrderController;
import Ecommerce.RETO2.Web.API.OrderProductController;




@Controller
public class ProductsOrdersViewController {

    private final OrderController ordersController;
    private final OrderProductController orderProductController;

    ProductsOrdersViewController(OrderController ordersController, OrdersServices ordersService,OrderProductController orderProductController){
        this.ordersController=ordersController;
        this.orderProductController=orderProductController;
   
    }
    //DEVUELVE TODOS LOS PRODUCTOS
    @GetMapping("/orderproducts/{id}")
    public ModelAndView Products(@PathVariable("id")Long id){
     AllOrderDTO pro = ordersController.GetAllOrders(id);
     List<OrderProductDTO> pro2 = orderProductController.GetId(id);
     ModelAndView mv = new ModelAndView("productsOrders");
     mv.addObject("productsOrder", pro);
     mv.addObject("listOrder", pro2);
     return mv;
    }

    @GetMapping("/products/add")
    public ModelAndView CreateProduct(){
        ModelAndView mv = new ModelAndView("addProduct");
        mv.addObject("product", new OrderProductDTO());
        return mv;
    }
    //METODO QUE CREA UN ORDERPRODUCT Y REDIRIGE A LA INFORMACION DEL PEDIDO AÑADIDO
    @PostMapping("/productAdd")
    public String Add(@ModelAttribute("product") OrderProductDTO addProduct){
       orderProductController.AddProductPedido(addProduct);
        return "redirect:/orders";
    }
}
