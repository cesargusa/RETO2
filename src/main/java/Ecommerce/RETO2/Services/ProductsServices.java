package Ecommerce.RETO2.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Ecommerce.RETO2.Repositories.Entities.ProductEntity;
import Ecommerce.RETO2.Repositories.Interfaces.ProductRepository;
import Ecommerce.RETO2.Services.Models.ProductCantidadDTO;
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
    public ProductDTO add(ProductDTO movie){
        ProductEntity entityToInsert = modelMapper.map(movie, ProductEntity.class);
        ProductEntity result = productRepository.save(entityToInsert);
        return modelMapper.map(result, ProductDTO.class);

    }
    public ProductDTO update(Long id, ProductDTO movie){
        ProductEntity entityToInsert = modelMapper.map(movie, ProductEntity.class);
        ProductEntity result = productRepository.save(entityToInsert);
        return modelMapper.map(result, ProductDTO.class);

    }
    public void delete(Long id){
        Optional<ProductEntity> entityToDelete = productRepository.findById(id);
        if(entityToDelete.isPresent()){
            productRepository.delete(entityToDelete.get());
        }
    }

      
    public List<ProductCantidadDTO> GetByProductCantidad(List<Object[]> input){
        List<ProductCantidadDTO> result = new ArrayList<ProductCantidadDTO>();
        for(Object[] object : input){
            result.add(new ProductCantidadDTO((ProductEntity)object[0],(int)object[1]));
        }

        return result;

    }

    public List<ProductCantidadDTO> findByOrderProduct(Long id){
        return GetByProductCantidad(productRepository.findByOrderId(id));
    }
    
}
