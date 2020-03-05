package io.cjf.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.cjf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.cjf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.cjf.jcartadministrationback.po.Address;

public interface AddressService {

    Address getById(Integer addressId);

}
