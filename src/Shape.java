public interface Shape
{
    void draw();
    static int square(int s)
    {
        return s * s;
    }
}
class Square implements Shape
{
    public void draw()
    {
        System.out.println("draw square");
    }
}
