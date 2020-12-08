// Alysia Wong
// CS 3560 -- A2

package minitwitter;

// VISITOR PATTERN -- for Message Total Button
public class MessageTotalVisitor implements UserComponentVisitor {
    @Override
    public int visit(User visitMessage){
        return visitMessage.getMessageCount();
    }

    @Override
    public int visit(UserGroup userGroupVisitor) {
        return 0;
    }
}
