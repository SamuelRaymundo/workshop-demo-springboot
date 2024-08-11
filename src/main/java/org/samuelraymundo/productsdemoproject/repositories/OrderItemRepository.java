package org.samuelraymundo.productsdemoproject.repositories;

import org.samuelraymundo.productsdemoproject.entities.OrderItem;
import org.samuelraymundo.productsdemoproject.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
