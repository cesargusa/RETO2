package Ecommerce.RETO2.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Ecommerce.RETO2.Repositories.Entities.ProductEntity;
import Ecommerce.RETO2.Repositories.Interfaces.ProductRepository;
import Ecommerce.RETO2.Services.Models.ProductDTO;

public class ProductsServices {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDTO> GetAll(){
        return productRepository.findAll().stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }

    public List<ProductDTO> GetById(Long id){
        return productRepository.findById(id).stream()
        .map(x -> modelMapper.map(x, ProductDTO.class))
        .collect(Collectors.toList());
    }
}