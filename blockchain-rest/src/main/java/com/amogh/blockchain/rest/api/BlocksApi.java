package com.amogh.blockchain.rest.api;

import com.amogh.blockchain.rest.api.factories.BlocksApiServiceFactory;
import com.amogh.blockchain.rest.model.Blocks;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import javax.servlet.ServletConfig;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


@Path("/blocks")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-09T12:48:35.615-06:00[America/Chicago]")public class BlocksApi  {
   private final BlocksApiService delegate;

   public BlocksApi(@Context ServletConfig servletContext) {
      BlocksApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BlocksApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BlocksApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BlocksApiServiceFactory.getBlocksApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "List all blocks", description = "", tags={ "blocks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A paged array of blocks", content = @Content(schema = @Schema(implementation = Blocks.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = Error.class))) })
    public Response listBlocks(@Parameter(description = "How many items to return at one time (max 100)") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listBlocks(limit,securityContext);
    }
}
