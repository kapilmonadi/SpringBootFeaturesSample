package com.kapil.archtests;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

@AnalyzeClasses(packages = "com.kapil", importOptions = ImportOption.DoNotIncludeTests.class)
public class UtilsArchTest {
    @ArchTest
    ArchRule arch_rule_only_static_methods_in_util_classes = methods().that().
            areDeclaredInClassesThat().resideInAPackage("..utils..").
            should().beStatic();

}
