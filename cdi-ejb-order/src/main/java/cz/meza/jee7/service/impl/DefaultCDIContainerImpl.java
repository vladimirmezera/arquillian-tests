package cz.meza.jee7.service.impl;

import cz.meza.jee7.service.ContainerService;

import javax.enterprise.inject.Default;

/**
 *  Default implementation of CDI container service.
 */
@Default
public class DefaultCDIContainerImpl implements ContainerService {

    public static final String TYPE = "defaultCDIImpl";

    public String getContainerType() {
        return  TYPE;
    }

}
