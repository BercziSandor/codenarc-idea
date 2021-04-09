package org.codenarc.idea.inspections.groovyism;

import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.psi.PsiElement;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;
import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.Violation;
import org.codenarc.rule.groovyism.GetterMethodCouldBePropertyRule;
import org.jetbrains.annotations.NotNull;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class GetterMethodCouldBePropertyInspectionTool extends CodeNarcInspectionTool<GetterMethodCouldBePropertyRule> {

    // this code has been generated from org.codenarc.rule.groovyism.GetterMethodCouldBePropertyRule

    public static final String GROUP = "Groovyism";

    public GetterMethodCouldBePropertyInspectionTool() {
        super(new GetterMethodCouldBePropertyRule());
    }

    @Override
    public String getRuleset() {
        return GROUP;
    }


    public void setApplyToClassNames(String value) {
        getRule().setApplyToClassNames(value);
    }

    public String getApplyToClassNames() {
        return getRule().getApplyToClassNames();
    }


    public void setDoNotApplyToClassNames(String value) {
        getRule().setDoNotApplyToClassNames(value);
    }

    public String getDoNotApplyToClassNames() {
        return getRule().getDoNotApplyToClassNames();
    }


    public void setIgnoreMethodsWithOverrideAnnotation(boolean value) {
        getRule().setIgnoreMethodsWithOverrideAnnotation(value);
    }

    public boolean getIgnoreMethodsWithOverrideAnnotation() {
        return getRule().getIgnoreMethodsWithOverrideAnnotation();
    }

    // custom code can be written after this line and it will be preserved during the regeneration

    @Override
    protected @NotNull Collection<LocalQuickFix> getQuickFixesFor(Violation violation, PsiElement violatingElement) {
        return Collections.emptyList();
    }

}