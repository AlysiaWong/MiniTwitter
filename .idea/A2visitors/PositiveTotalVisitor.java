// Alysia Wong
// CS 3560 -- A2

package minitwitter;

// VISITOR PATTERN -- for Positive Percentage Button
public class PositiveTotalVisitor implements UserComponentVisitor {
   @Override
    public int visit(User visitUserCount){
        return visitUserCount.getPositiveCount();
    }

    @Override
    public int visit(UserGroup userGroupVisitor) {
        return 0;
    }
}
