package com.cybersoft.demoSpringBoot.controller;

import com.cybersoft.demoSpringBoot.model.AccountModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping("/{id}/{customerName}")
    public ResponseEntity<?> index(@PathVariable int id,
                                   @PathVariable("customerName") String customer,
                                   @RequestParam(required = false,defaultValue = "") String address
                                   ){

        return new ResponseEntity<>(
                "Hello restfulApi " + id + " - " + customer + " - " + address,
                HttpStatus.OK);
    }

    /**
     * cac type truyen du lieu ngam` trong spring
     * 1) url-encoded : truyen du lieu ngam nhung khong dinh kem file
     * 2) form-data : truyen du lieu ngam co dinh kem file
     * 3) raw body : truyen du lieu ngam nhung dang json
     */
    @PostMapping("/{id}")
    public ResponseEntity<?> insertAccount(
            @PathVariable int id,
            @RequestBody AccountModel accountModel
    ){
//        AccountModel accountModel = new AccountModel();
//        accountModel.setId(id);
//        accountModel.setCustomerName("Long");
//        accountModel.setAge(21);
        return new ResponseEntity<>(accountModel,HttpStatus.OK);
    }
}
