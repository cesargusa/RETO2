package Ecommerce.RETO2.Repositories.Interfaces;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Ecommerce.RETO2.Repositories.Entities.OrderProductEntity;

public interface OrderProductRepository extends JpaRepository<OrderProductEntity,Long>{
    @Query(value = "SELECT p FROM OrderProduct p WHERE pedidoId = :id")
    List<OrderProductEntity> findOrderById(@Param("id") Long id);
}
