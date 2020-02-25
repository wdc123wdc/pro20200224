package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.AdministratorCreateInDTO;
import io.cjf.jcartadministrationback.dto.in.CustomerSearchInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductSearchlnDTO;
import io.cjf.jcartadministrationback.dto.out.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search (CustomerSearchInDTO customerSearchInDTO,
                                                  @RequestParam Integer pageNum
    ){
        return  null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById (@RequestParam Integer customerId){
        return  null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId ){

    }

}















