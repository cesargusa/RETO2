package Ecommerce.RETO2.Web.View;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.RETO2.Services.ProductsServices;
import Ecommerce.RETO2.Services.Models.ProductDTO;
import Ecommerce.RETO2.Web.API.ProductsController;

@Controller
public class ProductsViewController {
    private final ProductsController productsController;

    ProductsViewController(ProductsController productsController, ProductsServices productsServices){
        this.productsController=productsController;
   
    }
    //DEVUELVE TODOS LOS PRODUCTOS
    @GetMapping("/products")
    public ModelAndView Products(){
     List<ProductDTO> pro = productsController.GetAll();
     ModelAndView mv = new ModelAndView("products");
     mv.addObject("products", pro);
     return mv;
    }
}
