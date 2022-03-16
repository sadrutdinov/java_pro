package com.solid.isp.order_isp_solution;


public interface OrderService extends OrderProcessService {

    Order createOrder();

    Order amendOrder();

    boolean cancelOrder(int orderId);

    Order submitOrder(int orderId);

    Order getOrder(int orderId);

}
