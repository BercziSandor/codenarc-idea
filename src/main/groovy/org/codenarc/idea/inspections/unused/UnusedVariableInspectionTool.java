package org.codenarc.idea.inspections.unused;

import javax.annotation.Generated;

import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.unused.UnusedVariableRule;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class UnusedVariableInspectionTool extends CodeNarcInspectionTool<UnusedVariableRule> {

    // this code has been generated from org.codenarc.rule.unused.UnusedVariableRule

    public static final String GROUP = "Unused";

    public UnusedVariableInspectionTool() {
        super(new UnusedVariableRule());
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


    public void setIgnoreVariableNames(String value) {
        getRule().setIgnoreVariableNames(value);
    }

    public String getIgnoreVariableNames() {
        return getRule().getIgnoreVariableNames();
    }

    // custom code can be written after this line and it will be preserved during the regeneration

    // @Override
    // protected @NotNull Collection<LocalQuickFix> getQuickFixesFor(Violation violation, PsiElement violatingElement) {
    //     return Collections.singleton(myfix);
    // }
}