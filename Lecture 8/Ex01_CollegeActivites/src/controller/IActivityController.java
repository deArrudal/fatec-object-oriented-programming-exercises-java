package controller;

public interface IActivityController<T> {
    public void addActivity(T t);

    public void removeActivity(T t);

    public T findActivity(int index);

    public void clearList();

    public void displayList();

}
