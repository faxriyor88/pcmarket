package com.example.pcmarket.repository;

import com.example.pcmarket.custom.ProductCustom;
import com.example.pcmarket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "product",excerptProjection = ProductCustom.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "select * from  product where price>?1 and price<?2",nativeQuery = true)
    List<Product> filrpcPrice(Integer id1,Integer id2);

    @Query(value = "select * from  product where name=?1",nativeQuery = true)
    List<Product> filrpcName(String name);

    @Query(value = "select * from  product where name=?1 and price>?2 and price<?3",nativeQuery = true)
    List<Product> filrpcNamePrice(String  name,Integer id1,Integer id2);

    @Query(value = "select * from  product where info=?1",nativeQuery = true)
    List<Product> filrpcInfo(String  info);

    @Query(value = "select * from  product where name=?1 and info=?2",nativeQuery = true)
    List<Product> filrpcNameInfo(String  name,String info);

    @Query(value = "select * from  product where name=?1 and price>?2 and price<?3 and info=?4",nativeQuery = true)
    List<Product> filrpcNamePriceInfo(String  name,Integer id1,Integer id2,String info);

    @Query(value = "select * from  product where name=?1 and price>?2 and price<?3",nativeQuery = true)
    List<Product> filrpcInfoPrice(String  info,Integer id1,Integer id2);

    //Xarakteristika berib qidirish

    @Query(value = "select p.* from property inner join characteristics c on c.id = property.characteristics_id inner join product p on p.id = c.product_id where property.name IN (:names)",nativeQuery = true)
    List<Product> findProductFive(String names);


}
