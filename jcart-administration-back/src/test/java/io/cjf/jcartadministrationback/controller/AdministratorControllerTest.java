package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.constant.ClientExceptionConstant;
import io.cjf.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import io.cjf.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import io.cjf.jcartadministrationback.exception.ClientException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class AdministratorControllerTest {

    @Autowired
    private AdministratorController administratorController;

    @Test
    void login() throws ClientException {
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("123456");
        AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        assertNotNull(loginOutDTO);

        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("adad");

        try {
            loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE,errCode);
        }


        administratorLoginInDTO.setUsername("admin");
        administratorLoginInDTO.setPassword("adad");

        try {
            loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE,errCode);
        }
    }
}