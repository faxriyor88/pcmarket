package com.example.pcmarket.repository;

import com.example.pcmarket.custom.PropertyCustom;

import com.example.pcmarket.entity.Product;
import com.example.pcmarket.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "property",excerptProjection = PropertyCustom.class)
public interface PropertyRepository extends JpaRepository<Property,Integer> {
    // Bitta xarakteristika berib qidirish
    @Query(value = "select p.* from property inner join characteristics c on c.id = property.characteristics_id inner join product p on p.id = c.product_id where property.name=?1",nativeQuery = true)
    List<Product> findProductOne(String name);

    // Ikkita  xarakteristika berib qidirish
    @Query(value = "select p.* from property inner join characteristics c on c.id = property.characteristics_id inner join product p on p.id = c.product_id where property.name=?1 or property.name=?2",nativeQuery = true)
    List<Product> findProductTwo(String name,String name1);

    // Uchta xarakteristika berib qidirish
    @Query(value = "select p.* from property inner join characteristics c on c.id = property.characteristics_id inner join product p on p.id = c.product_id where property.name=?1 or property.name=?2 or property.name=?3",nativeQuery = true)
    List<Product> findProductThree(String name,String name1,String name2);

    // To'rtta  xarakteristika berib qidirish
    @Query(value = "select p.* from property inner join characteristics c on c.id = property.characteristics_id inner join product p on p.id = c.product_id where property.name=?1 or property.name=?2 or property.name=?3 or property.name=?4",nativeQuery = true)
    List<Product> findProductFour(String name,String name1,String name2,String name3);

    // Beshta  xarakteristika berib qidirish
    @Query(value = "select p.* from property inner join characteristics c on c.id = property.characteristics_id inner join product p on p.id = c.product_id where property.name=?1 or property.name=?2 or property.name=?3 or property.name=?4 or property.name=?5",nativeQuery = true)
    List<Product> findProductFive(String name,String name1,String name2,String name3,String name4);

}
