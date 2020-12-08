// Alysia Wong
// CS 3560 -- A2

package minitwitter;

// COMPOSITE PATTERN -- Interface that ties User and UserGroup together
// VISITOR PATTERN -- UserComponents accepts visitors
public interface UserComponent extends Visitable{
    public String getID();
}
