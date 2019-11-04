public class Retangulo{
    private float lenght = 1.0f;
    private float width = 1.0f;
    public Retangulo(){
    }

    public Retangulo (float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return lenght * width;
    }
    @Override
    public String toString() {
        return String.format("Retangulo: comprimento: %.2f largura: %.2f area:%.2f", lenght, width, getArea());
    }
}
