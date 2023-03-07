package com.example.service.impl;

import com.example.mapper.InvoiceMapper;
import com.example.model.Invoice;
import com.example.service.InvoiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Resource
    private InvoiceMapper invoiceMapper;

    @Override
    public List<Invoice> findAllBySid(Integer sid) {
        return null;
    }

    @Override
    public Boolean deleteByPid(Integer Pid) {
        return null;
    }

    @Override
    public Boolean addInvoice(Invoice invoice) {
        int insert = invoiceMapper.insertSelective(invoice);
        return insert>0?true:false;
    }
}
