package myProject;

public class Action {

    private String actionName;
    private int actionCode;

    public Action(String actionName, int actionCode) {
        this.actionName = actionName;
        this.actionCode = actionCode;
    }

    public String getActionName() {
        return actionName;
    }

    public int getActionCode() {
        return actionCode;
    }
}
