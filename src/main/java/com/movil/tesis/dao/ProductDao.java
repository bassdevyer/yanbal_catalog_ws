package com.movil.tesis.dao;

import com.movil.tesis.model.ProductosYanbal;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mac on 10/31/16.
 */
public interface ProductDao {

    @Transactional
    ProductosYanbal checkExistence(String code) throws Exception;
}
