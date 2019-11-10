package com.amogh.blockchain.rest.api.impl;

import com.amogh.blockchain.rest.api.BlocksApiService;
import com.amogh.blockchain.rest.api.NotFoundException;
import com.amogh.blockchain.rest.model.Blocks;
import com.amogh.blockchain.services.CreateBlock;
import com.amogh.blockchain.services.CreateBlockImpl;
import com.amogh.blockchain.utils.Block;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-09T12:48:35.615-06:00[America/Chicago]")public class BlocksApiServiceImpl extends BlocksApiService {
    @Override
    public Response listBlocks( Integer limit, SecurityContext securityContext) throws NotFoundException {

        CreateBlock createBlock = new CreateBlockImpl();
        Block block = createBlock.createNewBlock("temp", "temp");
        com.amogh.blockchain.rest.model.Block blockModel = new com.amogh.blockchain.rest.model.Block();
        blockModel.setName(block.getCurrentHash());
        blockModel.setTag(block.getPrevHash());
        Blocks blocks = new Blocks();
        blocks.add(blockModel);
        return Response.ok().entity(blocks).build();
    }
}
