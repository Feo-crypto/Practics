package Practice5;

public class Dishes {
    public static abstract class Dish{
        public String color, material;

        Dish (){}

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
    static class Plate extends Dish{
        double diameter;
        Plate (String color,String material,double diameter){
            this.color=color;
            this.material=material;
            this.diameter=diameter;
        }

        @Override
        public String toString() {
            return "Plate{" +
                    "diameter=" + diameter +"cm, "+"color: "+color+", material: "+material+
                    '}';
        }
    }
    static class Kettle extends Dish{
        double capacity;
        Kettle (String color,String material,double capacity){
            this.color=color;
            this.material=material;
            this.capacity=capacity;
        }
        @Override
        public String toString() {
            return "Kettle{" +
                    "capacity=" + capacity+"L, "+"color: "+color+", material: "+material+
                    '}';
        }
    }

    public static void main(String[] args) {
        Plate OrangePlastic=new Plate("Orange","Plastic",14.6);
        System.out.println(OrangePlastic.toString());
        Kettle RadSteel=new Kettle("Red","Steel",2.5);
        System.out.println(RadSteel.toString());
        RadSteel.setColor("Magenta");
        System.out.println(RadSteel.getColor());
        OrangePlastic.setMaterial("Ceramics");
        System.out.println(OrangePlastic.getMaterial());
        System.out.println(OrangePlastic.toString());
        System.out.println(RadSteel.toString());
    }


}
