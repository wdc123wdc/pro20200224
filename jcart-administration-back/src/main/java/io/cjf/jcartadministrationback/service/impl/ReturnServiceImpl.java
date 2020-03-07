package io.cjf.jcartadministrationback.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.cjf.jcartadministrationback.dao.ProductDetailMapper;
import io.cjf.jcartadministrationback.dao.ProductMapper;
import io.cjf.jcartadministrationback.dao.ReturnMapper;
import io.cjf.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.cjf.jcartadministrationback.dto.out.ProductListOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.cjf.jcartadministrationback.po.Product;
import io.cjf.jcartadministrationback.po.ProductDetail;
import io.cjf.jcartadministrationback.po.Return;
import io.cjf.jcartadministrationback.service.ProductService;
import io.cjf.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public Page<Return> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<Return> page = returnMapper.search();
        return page;
    }
}
