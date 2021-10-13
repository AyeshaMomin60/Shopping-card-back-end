package com.cg.cart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.cart.model.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}
