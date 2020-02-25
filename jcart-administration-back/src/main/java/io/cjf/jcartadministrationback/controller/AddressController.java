package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.ProductSearchlnDTO;
import io.cjf.jcartadministrationback.dto.out.AddressListOutDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId (@RequestParam Integer customerId){
        return  null;
    }
}
















