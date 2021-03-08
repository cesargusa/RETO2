package Ecommerce.RETO2.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Ecommerce.RETO2.Repositories.Entities.OrderEntity;
import Ecommerce.RETO2.Repositories.Entities.OrderProductEntity;
import Ecommerce.RETO2.Repositories.Entities.ProductEntity;
import Ecommerce.RETO2.Repositories.Interfaces.OrderProductRepository;
import Ecommerce.RETO2.Repositories.Interfaces.OrderRepository;
import Ecommerce.RETO2.Repositories.Interfaces.ProductRepository;

@Configuration
public class initDB {

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository, OrderRepository repository2,
            OrderProductRepository repository3) {
        return args -> {

          /*   repository.save(new ProductEntity("Altavoz portátil JBL Flip 5 negro Bluetooth", "99.99",
                    "https://cdn.grupoelcorteingles.es/SGFM/dctm/MEDIA03/201908/29/00138545233363____1__1200x1200.jpg"));
            repository.save(new ProductEntity("Xiaomi Mi 11 5G 8 GB + 256 GB Midnight Gray móvil libre", "799.90",
                    "https://cdn.grupoelcorteingles.es/SGFM/dctm/MEDIA03/202102/25/00157063601736009_7__640x640.jpg"));
            repository.save(new ProductEntity("Huawei Watch GT 2 Sport 46 mm Negro mate Smartwatch", "139",
                    "https://cdn.grupoelcorteingles.es/SGFM/dctm/MEDIA03/202001/09/00189060011627____10__1200x1200.jpg"));
            repository.save(new ProductEntity("Portátil HP 15s-fq2002ns i5, 16GB, 1TB SSD", "657",
                    "https://cdn.grupoelcorteingles.es/SGFM/dctm/MEDIA03/202011/13/00115215578277____1__1200x1200.jpg"));
            repository.save(new ProductEntity("Nuevo Apple iMac 21.5, i5, 8GB, 256GB SSD", "1185",
                    "https://cdn.grupoelcorteingles.es/SGFM/dctm/MEDIA03/202008/06/00115215120559____1__1200x1200.jpg"));

            repository2.save(new OrderEntity("1/06/2021", "cesargusa", "Aceptado"));
            repository2.save(new OrderEntity("12/12/2021", "alserna", "Cancelado"));
            repository2.save(new OrderEntity("5/3/2020", "esanchez", "En Entrega"));
            repository2.save(new OrderEntity("1/06/2021", "dimitri", "Aceptado"));

            repository3.save(new OrderProductEntity(1L, 1L, 4));
            repository3.save(new OrderProductEntity(1L, 2L, 3));
            repository3.save(new OrderProductEntity(4L, 2L, 4)); */

        };

    }
}
