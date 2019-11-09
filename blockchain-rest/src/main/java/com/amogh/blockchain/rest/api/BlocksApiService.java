package com.amogh.blockchain.rest.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-09T12:48:35.615-06:00[America/Chicago]")public abstract class BlocksApiService {
    public abstract Response listBlocks( Integer limit,SecurityContext securityContext) throws NotFoundException;
}
