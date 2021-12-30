package interfaces;

public class Advanced extends First implements MyInterface, MyInterface2, Plugin {
    @Override
    public void loadPlugin() {}
    @Override
    public void execute() {}
    @Override
    public void close() {}
    @Override
    public void justLoad() {}
}
