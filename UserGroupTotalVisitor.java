// Alysia Wong
// CS 3560 -- A2

package minitwitter;

// VISITOR PATTERN -- for User Group Total Button
public class UserGroupTotalVisitor implements UserComponentVisitor {
    @Override
    public int visit(User visitUserCount){
        return 0;
    }

    @Override
    public int visit(UserGroup userGroupVisitor) {
        return userGroupVisitor.getUserGroupCount();
    }
}
