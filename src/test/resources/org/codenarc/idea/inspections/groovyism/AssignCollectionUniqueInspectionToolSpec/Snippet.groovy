package rules

/**
 * Class to demonstrate code violations. <code>before.txt</code> and <code>fixed.txt</code>
 * files are only generated when missing so you need to delete these files if you want to regenerated them.
 */
class AssignCollectionUniqueInspectionToolSpecSnippet {

    void doSomething() {
        List one = ['foo', 'bar']
        List unique1 = one.unique()
        List unique2 = one.unique()
    }

}
