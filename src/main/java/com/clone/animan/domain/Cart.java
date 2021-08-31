package com.clone.animan.domain;


import com.clone.animan.dto.CartRequestDto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private Long price;

    @Column
    @NotNull
    private String productImage;

/*    @Column(nullable = false)
    private boolean isWished;*/

    @Column(nullable = false)
    private Long quantity;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String title;

    public void update(Long quantity) {
        this.quantity = quantity;
    }

    public Cart(CartRequestDto requestDto) {
        this.productId = requestDto.getProductId();
        this.quantity = requestDto.getQuantity();
        this.price = requestDto.getPrice();
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
    }
}
