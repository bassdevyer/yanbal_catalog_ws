package com.movil.tesis.service;

import com.movil.tesis.dao.ProductDao;
import com.movil.tesis.model.ProductosYanbal;

/**
 * Created by mac on 10/31/16.
 */
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public ProductosYanbal checkExistence(String code) throws Exception {
        return productDao.checkExistence(code);
    }
}
