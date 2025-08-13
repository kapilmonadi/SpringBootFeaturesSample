package com.kapil.archtests;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "com.kapil", importOptions = ImportOption.DoNotIncludeTests.class)
public class AnnotationArchTest {

    @ArchTest
    private static final ArchRule arch_rule_classes_annotated_as_deprecated_should_not_be_used = noClasses()
            .should().dependOnClassesThat().areNotAnnotatedWith(Deprecated.class);

}
