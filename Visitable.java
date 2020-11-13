// Alysia Wong
// CS 3560 -- A2

package minitwitter;

// VISITOR PATTERN -- UserComponent will extend Visitable (UserComponent accepts visitors)
public interface Visitable {
    public int accept(UserComponentVisitor visitor);
}
