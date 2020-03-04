package io.cjf.jcartstoreback.service;

import io.cjf.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.cjf.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.cjf.jcartstoreback.po.Customer;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

}
