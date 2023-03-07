package com.example.controller;

import com.example.model.Invoice;
import com.example.service.InvoiceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "进销接口")
@RequestMapping("/invoice")
public class InvoiceController {

    @Resource
    private InvoiceService invoiceService;

    @ApiOperation("添加进销商品")
    @GetMapping("/addInvoice")
    public Boolean addInvoice(@RequestBody Invoice invoice){
        System.out.println(invoice);
        invoice.setPid((int)System.currentTimeMillis());
        Boolean aBoolean = invoiceService.addInvoice(invoice);
        return aBoolean;
    }
}
