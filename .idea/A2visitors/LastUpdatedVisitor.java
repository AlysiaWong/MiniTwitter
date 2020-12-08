package A2visitors;

import A2.User;
import A2.UserGroup;

public class LastUpdatedVisitor implements UserComponentVisitor{
    long timeUpdated;

    @Override
    public int visit(User visitUserCount){
        timeUpdated = visitUserCount.getUpdateTime();
        return (int)timeUpdated;
    }

    @Override
    public int visit(UserGroup userGroupVisitor) {
        return 0;
    }

    public long getUpdated(){
        return timeUpdated;
    }
}
