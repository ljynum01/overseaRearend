package com.example.service;

import com.example.model.Invoice;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface InvoiceService {

    public List<Invoice> findAllBySid(Integer sid);

    public Boolean deleteByPid(Integer Pid);

    public Boolean addInvoice(Invoice invoice);
}
