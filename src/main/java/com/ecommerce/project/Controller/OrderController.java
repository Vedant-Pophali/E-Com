package com.ecommerce.project.Controller;

import com.ecommerce.project.Repositories.OrderRepository;
import com.stripe.service.climate.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderRepository orderRepository;

//    @PostMapping("/order/users/payments/{paymentMethod}")
//    public ResponseEntity<OrderDTO> orderProducts(@PathVariable String paymentMethod, @RequestBody OrderRequestDTO orderRequestDTO){
//        String emailId = authUtil.loggedInEmail();
//        OrderDTO order = orderService.placeOrder(emailId,orderRequestDTO.getAddressId(),
//                paymentMethod, OrderRequestDTO.getPgName(),OrderRequestDTO.getPgStatus(),
//                OrderRequestDTO.getPgResponseMessage());
//        return new ResponseEntity<>(order, HttpStatus.CREATED);
//    }
}