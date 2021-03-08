package Ecommerce.RETO2.Services;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Ecommerce.RETO2.Repositories.Entities.OrderEntity;
import Ecommerce.RETO2.Repositories.Interfaces.OrderRepository;
import Ecommerce.RETO2.Services.Models.OrderDTO;

public class OrdersServices {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderDTO> GetAll(){
        return orderRepository.findAll().stream()
        .map(x -> modelMapper.map(x, OrderDTO.class))
        .collect(Collectors.toList());
    }
    public List<OrderDTO> GetById(Long id){
        return orderRepository.findById(id).stream()
        .map(x -> modelMapper.map(x, OrderDTO.class))
        .collect(Collectors.toList());
    }
    public OrderEntity findByPedido(Long id){
        return orderRepository.findByPedido(id);
   
    }
}