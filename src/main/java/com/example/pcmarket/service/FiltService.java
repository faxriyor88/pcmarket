package com.example.pcmarket.service;

import com.example.pcmarket.entity.Product;
import com.example.pcmarket.repository.ProductRepository;
import com.example.pcmarket.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FiltService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    PropertyRepository propertyRepository;

    public List<Product> filtrPcPrice( Integer id1, Integer id2){
         List<Product> filrpc = productRepository.filrpcPrice(id1, id2);
         return filrpc;
     }
    public List<Product> filtrPcInfo( String info){
        List<Product> filrpc = productRepository.filrpcInfo(info);
        return filrpc;
    }
    public List<Product> filtrPcName( String name){
        List<Product> filrpc = productRepository.filrpcName(name);
        return filrpc;
    }
    public List<Product> filtrPcNameInfo(String name,String info){
        List<Product> filrpc = productRepository.filrpcNameInfo(name,info);
        return filrpc;
    }
    public List<Product> filtrPcNamePrice( String name,Integer id1,Integer  id2){
        List<Product> filrpc = productRepository.filrpcNamePrice(name,id1,id2);
        return filrpc;
    }
    public List<Product> filtrPcInfoPrice( String info,Integer id1,Integer id2){
        List<Product> filrpc = productRepository.filrpcInfoPrice(info,id1,id2);
        return filrpc;
    }
    public List<Product> filtrPcNameInfoPrice(String info, String name, Integer id1, Integer id2){
        List<Product> filrpc = productRepository.filrpcNamePriceInfo(name,id1,id2,info);
        return filrpc;
    }
    /// ================= Xarakteristkalar =========
    public List<Product> charakOne(String name){
        List<Product> charak=propertyRepository.findProductOne(name);
        return charak;
    }
    public List<Product> charakTwo(String name,String name2){
        List<Product> charak=propertyRepository.findProductTwo(name,name2);
        return charak;
    }
    public List<Product> charakThree(String name,String name2,String name3){
        List<Product> charak=propertyRepository.findProductThree(name,name2,name3);
        return charak;
    }
    public List<Product> charakFour(String name,String name2,String name3,String name4){
        List<Product> charak=propertyRepository.findProductFour(name,name2,name3,name4);
        return charak;
    }
    public List<Product> charakFive(String name,String name2,String name3,String name4,String name5){
        List<Product> charak=propertyRepository.findProductFive(name,name2,name3,name4,name5);
        return charak;
    }
}
