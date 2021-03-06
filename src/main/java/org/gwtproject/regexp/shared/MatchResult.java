package org.gwtproject.regexp.shared;

public interface MatchResult {

    /**
     * Retrieves the matched string or the given matched group.
     *
     * @param index the index of the group to return, 0 to return the whole
     *              matched string; must be between 0 and {@code getGroupCount() - 1}
     *              included
     * @return The matched string if {@code index} is zero, else the given matched
     * group. If the given group was optional and did not match, the
     * behavior is browser-dependent: this method will return {@code null}
     * or an empty string.
     */
    String getGroup(int index);

    /**
     * Returns the number of groups, including the matched string hence greater or
     * equal than 1.
     */
    int getGroupCount();

    /**
     * Returns the zero-based index of the match in the input string.
     */
    int getIndex();

    /**
     * Returns the original input string.
     */
    String getInput();
}
