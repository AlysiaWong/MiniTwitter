// Alysia Wong
// CS 3560 -- A2

package minitwitter;

// VISITOR PATTERN -- for any added visitors, implement this interface
public interface UserComponentVisitor {
    public int visit(User userVisitor);
    public int visit(UserGroup userGroupVisitor);
}