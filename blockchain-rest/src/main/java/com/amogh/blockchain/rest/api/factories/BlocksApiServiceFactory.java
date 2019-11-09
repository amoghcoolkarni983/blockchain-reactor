package com.amogh.blockchain.rest.api.factories;


import com.amogh.blockchain.rest.api.BlocksApiService;
import com.amogh.blockchain.rest.api.impl.BlocksApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-09T12:48:35.615-06:00[America/Chicago]")public class BlocksApiServiceFactory {
    private final static BlocksApiService service = new BlocksApiServiceImpl();

    public static BlocksApiService getBlocksApi() {
        return service;
    }
}
