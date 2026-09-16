package org.educandoweb.course.repositories;

import org.educandoweb.course.entities.Category;
import org.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
