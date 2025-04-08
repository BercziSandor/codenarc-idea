package org.codenarc.idea.quickfix;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.codeInspection.util.IntentionName;
import com.intellij.modcommand.ActionContext;
import com.intellij.modcommand.ModCommandAction;
import com.intellij.modcommand.ModPsiUpdater;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.intentions.base.PsiElementPredicate;
import org.jetbrains.plugins.groovy.intentions.style.RemoveRedundantClassPropertyIntention;

public class RemoveRedundantClassPropertyReusableIntention extends RemoveRedundantClassPropertyIntention implements ReusableIntention {

  @Override
  public void processIntention (@NotNull PsiElement element,
                                @NotNull ActionContext context,
                                @NotNull ModPsiUpdater updater) throws IncorrectOperationException {
    super.processIntention(element, context, updater);
  }

  @Override
  public void processIntention (@NotNull PsiElement element,
                                @NotNull Project project,
                                Editor editor) throws IncorrectOperationException {
    // TODO document why this method is empty
  }

  @NotNull
  @Override
  public PsiElementPredicate getElementPredicate () {
    return super.getElementPredicate();
  }

  @Override
  public @IntentionName @NotNull String getText () {
    return "";
  }

  @Override
  public boolean isAvailable (@NotNull Project project,
                              Editor editor,
                              PsiFile psiFile) {
    return false;
  }

  @Override
  public void invoke (@NotNull Project project,
                      Editor editor,
                      PsiFile psiFile) throws IncorrectOperationException {
    // TODO document why this method is empty
  }

  @Override
  public boolean startInWriteAction () {
    return false;
  }

  @Override
  public @NotNull IntentionAction asIntention () {
    return super.asIntention();
  }

  @Override
  public @NotNull ModCommandAction asModCommandAction () {
    return super.asModCommandAction();
  }
}
