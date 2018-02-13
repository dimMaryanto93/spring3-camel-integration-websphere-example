package com.maryanto.dimas.webapp.example.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class SiteMeshFilteringConfig extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder
//                .addDecoratorPath("*/popup/*", "/WEB-INF/template/popup.jsp")
                .addDecoratorPath("/*", "/WEB-INF/template/main.jsp")
                .addExcludedPath("/logout")
                .addExcludedPath("/login")
                .addExcludedPath("/deny")
                .addExcludedPath("/expired")
                .addExcludedPath("*/json/*")
                .addExcludedPath("*/reports/*")
                .addExcludedPath("*/xml/*")
                .addExcludedPath("/api/*");
    }
}
