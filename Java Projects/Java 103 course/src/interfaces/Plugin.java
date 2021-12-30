package interfaces;
public interface Plugin {
    public abstract void loadPlugin();
    public void execute();
    void close();
}
