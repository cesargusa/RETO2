package Ecommerce.RETO2.Repositories.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Ecommerce.RETO2.Repositories.Entities.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity,Long>{
        @Query(value = "SELECT p FROM Product p WHERE id = :id")
        List<ProductEntity> findProductById(@Param("id") Long id);


         @Query(value = "SELECT p, pp.cantidad FROM OrderProduct pp "+
        " INNER JOIN Product p ON pp.productId = p.id "+
        " WHERE pp.pedidoId = :id ")
        List<Object[]> findByOrderId(@Param("id") Long id);

    /*     SELECT p.name, p.price, p.url, pp.cantidad FROM pp 
        INNER JOIN product p ON pp.product_id = p.id 
        WHERE pp.pedido_id = 4
 */














       //Sentencia SQL que muestra los posts de los usuarios con un salario mayor al que introduzcamos
/*        @Query(value = "SELECT p FROM Product p INNER JOIN PP pp ON p.id = pp.id INNER JOIN Pedido p ON p.id = pp.id WHERE pp.pedidoId = :id")
/*  */
      /*   @Query(value = "SELECT p FROM Product p INNER JOIN Pedido pe ON pe.id = p.id INNER JOIN PP pp ON pp.id = pe.id WHERE pp.id = :id")
        Collection<ProductEntity> findByPedido(@Param("id") Long id);  */

/*         SELECT 
    *
FROM orders O
INNER JOIN ordersproducts OP
    ON O.id = OP.id_order
INNER JOIN products P
    ON OP.id_product = P.id
    WHERE OP.id_order = 4;
} */
}

