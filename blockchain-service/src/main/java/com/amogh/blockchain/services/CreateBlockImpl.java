package com.amogh.blockchain.services;

import com.amogh.blockchain.services.utils.ValidateCurrentHash;
import com.amogh.blockchain.utils.Block;

import java.util.UUID;

/**
 *
 */
public class CreateBlockImpl implements CreateBlock
{
    public ValidateCurrentHash validateCurrentHash;

    /**
     *
     */
    public CreateBlockImpl()
    {
        this(new ValidateCurrentHash());
    }

    public CreateBlockImpl(final ValidateCurrentHash validateCurrentHash)
    {
        this.validateCurrentHash = validateCurrentHash;
    }

    @Override
    public Block createNewBlock(String prevHash, String currentHash)
    {
        final String id = UUID.randomUUID().toString();
        final String newHash = UUID.randomUUID().toString();
        final boolean isCurrentHashValidated =  validateCurrentHash.validateBlock(currentHash);
        if(isCurrentHashValidated) {
            final Block block = new Block(id, currentHash, newHash);
            return block;
        }
        return null;
    }

}
