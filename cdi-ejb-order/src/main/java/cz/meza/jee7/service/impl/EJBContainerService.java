package cz.meza.jee7.service.impl;

import cz.meza.jee7.service.ContainerService;

/**
 * Implementation of EJB ContainerService.
 */
public class EJBContainerService implements ContainerService {

    public static final String TYPE = "ejb";

    public String getContainerType() {
        return TYPE;
    }
}
