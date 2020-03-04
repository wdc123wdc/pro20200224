package io.cjf.jcartstoreback.service;

import io.cjf.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.cjf.jcartstoreback.po.Address;
import io.cjf.jcartstoreback.po.Customer;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

    Integer create(Address address);

    void update(Address address);

    void delete(Integer addressId);

}
