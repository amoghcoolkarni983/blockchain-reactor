package com.amogh.blockchain.rest;

import com.amogh.blockchain.rest.api.BlocksApi;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


/**
 * JAX-RS {@link Application} that contributes the components necessary to expose RESTful Blockchain services.
 *
 * @author Amogh Kulkarni
 */
public class BlockchainApplication extends Application {

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Class<?>> getClasses()
    {
        Set set = new HashSet();
        set.add(SwaggerSerializers.class);
        set.add(BlocksApi.class);
        return set;
    }
}
