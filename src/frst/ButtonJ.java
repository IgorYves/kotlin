package frst;

public class ButtonJ implements View {
    @Override
    public State getCurrState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(State state) {

    }

    public class ButtonState implements State {

    }
}
