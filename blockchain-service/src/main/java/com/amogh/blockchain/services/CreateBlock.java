package com.amogh.blockchain.services;

import  com.amogh.blockchain.utils.Block;
/**
 * Interface to create new block
 */
public interface CreateBlock {

    /**
     * Method to which creates new Block
     * @param prevHash
     * @param currentHash
     * @return
     */
    Block createNewBlock(String prevHash, String currentHash);

}
