package org.samuelraymundo.productsdemoproject.repositories;

import org.samuelraymundo.productsdemoproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
