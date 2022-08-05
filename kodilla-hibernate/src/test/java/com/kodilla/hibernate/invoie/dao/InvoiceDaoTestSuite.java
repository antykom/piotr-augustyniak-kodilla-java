package com.kodilla.hibernate.invoie.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product prod1 = new Product("Coffee");
        Product prod2 = new Product("Tea");
        Item item1 = new Item(prod1, new BigDecimal(10), 5,new BigDecimal(50));
        Item item2 = new Item(prod2, new BigDecimal(15), 2, new BigDecimal(30));
        item1.setProduct(prod1);
        item2.setProduct(prod2);
        Invoice inv = new Invoice("1/08/2022");
        inv.getItems().add(item1);
        inv.getItems().add(item2);
        item1.setInvoice(inv);
        item2.setInvoice(inv);


        //When
        invoiceDao.save(inv);
        int id = inv.getId();

        //Then
        assertNotEquals(0,id);

        //CleanUp
        //invoiceDao.deleteById(id);

    }
}
