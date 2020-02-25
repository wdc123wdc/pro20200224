package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.AdministratorUpdateInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductCreatInDTO;
import io.cjf.jcartadministrationback.dto.in.ProductSearchlnDTO;
import io.cjf.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductListOutDTO;
import io.cjf.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search (ProductSearchlnDTO productSearchlnDTO,
    @RequestParam Integer pageNum
    ){
        return  null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById  (@RequestParam Integer productId){
        return  null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreatInDTO productCreatInDTO){
        return  null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }
}
