// Alysia Wong
// CS 3560 -- A2

package minitwitter;

// VISITOR PATTERN -- for User Total Button
public class UserTotalVisitor implements UserComponentVisitor {
    @Override
    public int visit(User visitUserCount){
        return visitUserCount.getUserCount();
    }

    @Override
    public int visit(UserGroup userGroupVisitor) {
        return 0;
    }
}
