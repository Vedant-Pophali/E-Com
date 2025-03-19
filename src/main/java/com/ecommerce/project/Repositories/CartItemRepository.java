package com.ecommerce.project.Repositories;
import com.ecommerce.project.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    @Query("SELECT ci FROM CartItem ci WHERE ci.cartItemId = ?1 AND ci.product = ?2")
    CartItem findCartItemByProductIdAndCartId(Long cartId, Long productId);
    @Modifying
    @Query("DELETE FROM CartItem ci WHERE ci.cartItemId = ?1 AND ci.product = ?2")
    void deleteCartItemByProductIdAndCartId(Long cartId, Long productId);
}