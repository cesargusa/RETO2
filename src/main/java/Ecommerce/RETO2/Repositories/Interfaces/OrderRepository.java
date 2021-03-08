package Ecommerce.RETO2.Repositories.Interfaces;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Ecommerce.RETO2.Repositories.Entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity,Long>{
    @Query(value = "SELECT p FROM Product p WHERE id = :id")
    List<OrderEntity> findOrderById(@Param("id") Long id);

    
    @Query(value = "SELECT O FROM Pedido O "+
    "WHERE O.id = :id")
    OrderEntity findByPedido(@Param("id") Long id);



}
