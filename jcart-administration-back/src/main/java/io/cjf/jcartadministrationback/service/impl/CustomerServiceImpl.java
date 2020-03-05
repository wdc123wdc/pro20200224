package io.cjf.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.cjf.jcartadministrationback.dao.CustomerMapper;
import io.cjf.jcartadministrationback.dao.OrderDetailMapper;
import io.cjf.jcartadministrationback.dao.OrderMapper;
import io.cjf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.cjf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.cjf.jcartadministrationback.po.Customer;
import io.cjf.jcartadministrationback.po.Order;
import io.cjf.jcartadministrationback.po.OrderDetail;
import io.cjf.jcartadministrationback.service.CustomerService;
import io.cjf.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Page<Customer> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Customer> page = customerMapper.search();
        return page;
    }

    @Override
    public Customer getById(Integer customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return customer;
    }
}
