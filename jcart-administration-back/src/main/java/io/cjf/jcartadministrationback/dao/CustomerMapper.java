package io.cjf.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.cjf.jcartadministrationback.po.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    Page<Customer> search();
}