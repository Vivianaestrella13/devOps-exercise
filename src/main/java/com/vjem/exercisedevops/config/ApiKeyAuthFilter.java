package com.vjem.exercisedevops.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;
import org.springframework.stereotype.Component;

public class ApiKeyAuthFilter extends AbstractPreAuthenticatedProcessingFilter {

    private final String headerName;

    public ApiKeyAuthFilter(final String headerName) {
        this.headerName = headerName;
    }

    @Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
        return request.getHeader(headerName);
    }

    @Override
    protected Object getPreAuthenticatedCredentials(HttpServletRequest request) {
        // No credentials when using API key
        return null;
    }
}
