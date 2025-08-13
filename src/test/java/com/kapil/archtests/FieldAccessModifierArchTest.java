package com.kapil.archtests;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;

@AnalyzeClasses(packages = "com.kapil", importOptions = ImportOption.DoNotIncludeTests.class)
public class FieldAccessModifierArchTest {
    private static final ArchRule instance_variables_should_be_marked_private = fields()
            .should().bePrivate()
            .because("Instance variables should be marked as private and be made available via public accessor methods. ");
}
