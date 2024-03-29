package model.server_side;

import java.util.ArrayList;

public interface Searchable<T>  {
    public State<T> getInitialState();
    public State<T> getGoalState();
    public ArrayList<State<T>> getAllPossibleStates(State<T> s);
    public <Solution> Solution backTrace(State goal);
}
