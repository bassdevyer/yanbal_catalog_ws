package com.movil.tesis.service;

import com.movil.tesis.model.ProductosYanbal;

/**
 * Created by mac on 10/31/16.
 */
public interface ProductService {

    ProductosYanbal checkExistence(String code) throws Exception;
}
