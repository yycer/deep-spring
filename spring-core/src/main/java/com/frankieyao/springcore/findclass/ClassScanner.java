package com.frankieyao.springcore.findclass;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClassScanner {
    public static void main(String[] args) throws IOException {
        String basePackage = "com.frankieyao.springcore";
        List<Resource> resources = scanClassResources(basePackage);
        resources.forEach(resource -> System.out.println(resource.getFilename()));
    }

    private static List<Resource> scanClassResources(String basePackage) throws IOException {
        Function<String, String> resolveBasePackageFunction = s -> s.replace(".", "/");
        // classpath*:com/frankieyao/springcore/**/*.class
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX
                .concat(resolveBasePackageFunction.apply(basePackage)).concat("/**/*.class");

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        return Arrays.asList(resolver.getResources(packageSearchPath));
    }
}
