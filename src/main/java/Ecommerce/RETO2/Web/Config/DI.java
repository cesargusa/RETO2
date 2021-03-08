package Ecommerce.RETO2.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Ecommerce.RETO2.Services.OrderProductServices;
import Ecommerce.RETO2.Services.OrdersServices;
import Ecommerce.RETO2.Services.ProductsServices;

@Configuration
public class DI {
    @Bean
    ModelMapper createModelMapper() {
        return new ModelMapper();
    }

    @Bean
    ProductsServices createProductsServices(){
        return new ProductsServices();
    }
    @Bean
    OrdersServices createOrdersService(){
        return new OrdersServices();
    }
    @Bean
    OrderProductServices createPPService(){
        return new OrderProductServices();
    }
}