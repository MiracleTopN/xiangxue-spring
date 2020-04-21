package com.enjoy.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class JamesImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[];
    }
}
