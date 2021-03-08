package Ecommerce.RETO2.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Ecommerce.RETO2.Repositories.Entities.OrderProductEntity;
import Ecommerce.RETO2.Repositories.Interfaces.OrderProductRepository;
import Ecommerce.RETO2.Services.Models.OrderProductDTO;



public class OrderProductServices {
    @Autowired
    private OrderProductRepository orderProductRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<OrderProductDTO> GetAll(){
        return orderProductRepository.findAll().stream()
        .map(x -> modelMapper.map(x, OrderProductDTO.class))
        .collect(Collectors.toList());
    }
    public List<OrderProductDTO> GetById(Long id){
        return orderProductRepository.findOrderById(id).stream()
        .map(x -> modelMapper.map(x, OrderProductDTO.class))
        .collect(Collectors.toList());
    }
    public OrderProductDTO add(OrderProductDTO movie){
        OrderProductEntity ProductPedidoInsert = modelMapper.map(movie, OrderProductEntity.class);
        OrderProductEntity result = orderProductRepository.save(ProductPedidoInsert);
        return modelMapper.map(result, OrderProductDTO.class);

    }
    public OrderProductDTO update(Long id, OrderProductDTO ProductPedido){
        OrderProductEntity entityToInsert = modelMapper.map(ProductPedido, OrderProductEntity.class);
        OrderProductEntity result = orderProductRepository.save(entityToInsert);
        return modelMapper.map(result, OrderProductDTO.class);

    }
    public void delete(Long id){
        Optional<OrderProductEntity> entityToDelete = orderProductRepository.findById(id);
        if(entityToDelete.isPresent()){
            orderProductRepository.delete(entityToDelete.get());
        }
    }

}
