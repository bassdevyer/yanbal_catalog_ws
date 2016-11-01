package com.movil.tesis.controller;

import com.movil.tesis.model.ProductosYanbal;
import com.movil.tesis.service.ProductService;

import javax.jws.WebService;
import javax.ws.rs.*;

/**
 * Created by mac on 10/12/16.
 */
@Path("/")
@WebService(name = "yanbal_catalog_ws")
public class WSController {

    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GET
    @Path("/check")
    @Produces("application/json")
    public ProductosYanbal checkExistence(@QueryParam("code") String code) {
        ProductosYanbal outcome = null;
        try {
            outcome = productService.checkExistence(code);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }

}
