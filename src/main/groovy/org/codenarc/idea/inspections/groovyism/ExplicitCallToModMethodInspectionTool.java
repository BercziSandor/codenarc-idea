package org.codenarc.idea.inspections.groovyism;

import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.psi.PsiElement;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;
import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.Violation;
import org.codenarc.rule.groovyism.ExplicitCallToModMethodRule;
import org.jetbrains.annotations.NotNull;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class ExplicitCallToModMethodInspectionTool extends CodeNarcInspectionTool<ExplicitCallToModMethodRule> {

    // this code has been generated from org.codenarc.rule.groovyism.ExplicitCallToModMethodRule

    public static final String GROUP = "Groovyism";

    public ExplicitCallToModMethodInspectionTool() {
        super(new ExplicitCallToModMethodRule());
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


    public void setIgnoreThisReference(boolean value) {
        getRule().setIgnoreThisReference(value);
    }

    public boolean getIgnoreThisReference() {
        return getRule().getIgnoreThisReference();
    }

    // custom code can be written after this line and it will be preserved during the regeneration

    @Override
    protected @NotNull Collection<LocalQuickFix> getQuickFixesFor(Violation violation, PsiElement violatingElement) {
        return Collections.emptyList();
    }

}