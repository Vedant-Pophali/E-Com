package com.ecommerce.project.Repositories;

import com.ecommerce.project.Model.Category;
import com.ecommerce.project.Model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByCategoryOrderByPriceAsc(Category category, Pageable pageDetails);
    Page<Product> findByProductNameLikeIgnoreCase(String keyword, Pageable pageDetails);
}