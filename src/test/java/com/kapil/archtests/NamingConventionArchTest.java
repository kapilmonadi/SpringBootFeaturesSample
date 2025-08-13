package com.kapil.archtests;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "com.kapil", importOptions = ImportOption.DoNotIncludeTests.class)
public class NamingConventionArchTest {

    @ArchTest
    private static final ArchRule arch_rule_naming_convention = classes().that().
            resideInAPackage("..constants..").should().
            haveSimpleNameEndingWith("Constants");
}
