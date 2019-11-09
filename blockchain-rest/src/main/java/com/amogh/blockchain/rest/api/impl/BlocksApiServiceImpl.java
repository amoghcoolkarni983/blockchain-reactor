package com.amogh.blockchain.rest.api.impl;

import com.amogh.blockchain.rest.api.ApiResponseMessage;
import com.amogh.blockchain.rest.api.BlocksApiService;
import com.amogh.blockchain.rest.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-09T12:48:35.615-06:00[America/Chicago]")public class BlocksApiServiceImpl extends BlocksApiService {
    @Override
    public Response listBlocks( Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
