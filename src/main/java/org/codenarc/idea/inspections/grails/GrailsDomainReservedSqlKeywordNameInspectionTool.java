package org.codenarc.idea.inspections.grails;

        import com.intellij.codeInspection.LocalQuickFix;
        import com.intellij.psi.PsiElement;
        import java.util.Collection;
        import java.util.Collections;
        import javax.annotation.Generated;
        import org.codenarc.idea.CodeNarcInspectionTool;
        import org.codenarc.rule.Violation;
        import org.codenarc.rule.grails.GrailsDomainReservedSqlKeywordNameRule;
        import org.jetbrains.annotations.NotNull;

        @Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
        public class GrailsDomainReservedSqlKeywordNameInspectionTool extends CodeNarcInspectionTool<GrailsDomainReservedSqlKeywordNameRule> {

            // this code has been generated from org.codenarc.rule.grails.GrailsDomainReservedSqlKeywordNameRule

            public static final String GROUP = "Grails";

            public GrailsDomainReservedSqlKeywordNameInspectionTool() {
                super(new GrailsDomainReservedSqlKeywordNameRule());
                applyDefaultConfiguration(getRule());
            }

            @Override
            public String getRuleset() {
                return GROUP;
            }


            public void setAdditionalHibernateBasicTypes(String value) {
                getRule().setAdditionalHibernateBasicTypes(value);
            }

            public String getAdditionalHibernateBasicTypes() {
                return getRule().getAdditionalHibernateBasicTypes();
            }


            public void setAdditionalReservedSqlKeywords(String value) {
                getRule().setAdditionalReservedSqlKeywords(value);
            }

            public String getAdditionalReservedSqlKeywords() {
                return getRule().getAdditionalReservedSqlKeywords();
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

    // custom code can be written after this line and it will be preserved during the regeneration

    @Override
    protected @NotNull Collection<LocalQuickFix> getQuickFixesFor(Violation violation, PsiElement violatingElement) {
        return Collections.emptyList();
    }

}
