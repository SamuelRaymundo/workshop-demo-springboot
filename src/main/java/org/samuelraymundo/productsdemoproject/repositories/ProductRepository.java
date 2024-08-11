package org.samuelraymundo.productsdemoproject.repositories;

import org.samuelraymundo.productsdemoproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
