package com.amogh.blockchain.services;

import com.amogh.blockchain.services.utils.ValidateCurrentHash;
import com.amogh.blockchain.utils.Block;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Test file for testing {@link CreateBlockImpl}
 */
@RunWith(MockitoJUnitRunner.class)
public class CreateBlockImplTest {

    public CreateBlockImpl createBlock;

    @Mock
    private ValidateCurrentHash validateCurrentHash;

    @Before
    public void setUp()
    {
         createBlock = new CreateBlockImpl(validateCurrentHash);
    }

    @Test
    public void  createNewBlockTestPositiveScenario()
    {
        final String prevHash = "mock";
        final String newHash = "mock";
        when(validateCurrentHash.validateBlock(anyString())).thenReturn(true);
        final Block block = createBlock.createNewBlock(prevHash, newHash);
        assertNotNull(block);
        assertNotNull(block.getId());
    }


    @Test
    public void  createNewBlockTestNegativeScenario()
    {
        final String prevHash = "mock";
        final String newHash = "mock";
        when(validateCurrentHash.validateBlock(anyString())).thenReturn(false);
        final Block block = createBlock.createNewBlock(prevHash, newHash);
        assertNull(block);
    }

}