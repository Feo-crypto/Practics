package Practice5;

public class Dogs {
    static abstract public class Dog{
        double age, weight;
        String size;

        Dog(){}

        public void setAge(double age) {
            this.age = age;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        public String getSize() {
            return size;
        }
        public void AgeConvert(){
            age=age*7;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "age=" + age +
                    ", weight=" + weight +
                    ", size='" + size + '\'' +
                    '}';
        }
    }
    public static class Pug extends Dog{
        String condolences;
        Pug(double age, double weight,String size, String condolences){
            this.condolences=condolences;
            this.age=age;
            this.weight=weight;
            this.size=size;
        }

        public void setCondolences(String condolences) {
            this.condolences = condolences;
        }

        public String getCondolences() {
            return condolences;
        }

        @Override
        public String toString() {
            return "Pug{" +
                    "age=" + age +
                    ", weight=" + weight +
                    ", size='" + size + '\'' +
                    ", condolences='" + condolences + '\'' +
                    '}';
        }
    }
    public static class Hound extends Dog{
        double topSpeed;
        Hound(double age, double weight,String size, double topSpeed){
            this.age=age;
            this.weight=weight;
            this.topSpeed=topSpeed;
            this.size=size;
        }

        public void setTopSpeed(double topSpeed) {
            this.topSpeed = topSpeed;
        }

        public double getTopSpeed() {
            return topSpeed;
        }

        @Override
        public String toString() {
            return "Hound{" +
                    "age=" + age +
                    ", weight=" + weight +
                    ", size='" + size + '\'' +
                    ", topSpeed=" + topSpeed + "Kph"+
                    '}';
        }
    }

    public static void main(String[] args) {
        Pug PugPup=new Pug(0.7,4,"Small","At least it's cute...");
        System.out.println(PugPup.toString());
        Hound MediumRunner=new Hound(3,18, "Medium", 30);
        System.out.println(MediumRunner.toString());
        PugPup.setCondolences("Poor things...");
        PugPup.setAge(2);
        System.out.println("Pug's new age: "+PugPup.getAge());
        MediumRunner.AgeConvert();
        System.out.println("Hound's converted age: "+MediumRunner.getAge());
        MediumRunner.setTopSpeed(35);
        MediumRunner.setWeight(25);
        MediumRunner.setSize("Big");
        System.out.println("The hound grew! "+" Hound's new size is: "+MediumRunner.getSize()+" Hound's new speed is: "+MediumRunner.getTopSpeed()+" And weight: "+MediumRunner.getWeight());
        System.out.println("Pugs are an example of cruel artificial selection. "+PugPup.getCondolences());

    }

}
