package homeWork;

public class Box {

    public int width;

    public int height;

    public int length;

    public Box(int width, int height, int length) {

        this.width = width;
        this.height = height;
        this.length = length;

        System.out.println(width * height * length);
    }
}
