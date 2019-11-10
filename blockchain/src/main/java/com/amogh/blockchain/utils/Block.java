package com.amogh.blockchain.utils;


import lombok.Value;

/**
 * POJO class for Block
 */
@Value
public class Block {
    String id;
    String prevHash;
    String currentHash;
}
