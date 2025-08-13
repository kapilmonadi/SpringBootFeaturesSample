package com.kapil.archtests;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTag;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION;

@AnalyzeClasses(packages = "com.kapil", importOptions = ImportOption.DoNotIncludeTests.class)
@ArchTag("autowiring")
public class AutowiringArchTest {
    private static final ArchRule no_classes_should_use_field_injection = NO_CLASSES_SHOULD_USE_FIELD_INJECTION
    .because("Constructor Injection is the recommended approach from experts");
}
