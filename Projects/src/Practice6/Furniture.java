package Practice6;

public abstract class Furniture {
    public String color, material;

    Furniture (){}

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public abstract String toString();
}

