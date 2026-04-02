package com.example.demo.order;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    public void createOrder() {
        String existingOrder = null;

        if (existingOrder != null) {
            throw new RuntimeException("이미 존재하는 주문입니다.");
        }
    }

    public List<String> getAllOrders() {
        // memberRepository.findAll() 대응
        return null;
    }

    public String getOrderById(Long id) {
        // memberRepository.findById(id) 대응
        String order = null;

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수 없습니다");
        }

        return order;
    }

    public void deleteOrder(Long id) {
        // memberRepository.findById(id) 대응
        String order = null;

        if (order == null) {
            throw new RuntimeException("주문을 찾을 수가 없습니다");
        }

        // memberRepository.deleteById(id) 대응
    }
}