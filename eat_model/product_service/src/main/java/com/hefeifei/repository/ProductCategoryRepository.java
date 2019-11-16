package com.hefeifei.repository;

import com.hefeifei.entity.ProductCategory;
import com.hefeifei.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findAll();

}
