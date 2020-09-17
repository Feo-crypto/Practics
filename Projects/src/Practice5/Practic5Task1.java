package Practice5;

public class Practic5Task1 {

    public static abstract class Dish{
        protected String material;
        protected String colour;
        protected String originCountry;
        protected boolean clean=true;

        public void setDish(String material, String colour, String originCountry){
            this.colour = colour;
            this.material = material;
            this.originCountry = originCountry;
        }
        public void Wash(){
            clean=true;
        }
        public void setClean(boolean clean) {
            this.clean = clean;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }

        public String getColour() {
            return colour;
        }

        public String getMaterial() {
            return material;
        }

        public String getOriginCountry() {
            return originCountry;
        }

        abstract public String ToString();
    }
    public static class Mug extends Dish{
        private boolean full=false;
        public void Wash(){
            clean=true;
            full=false;
        }

        public void setFull(boolean full) {
            this.full = full;
            if(full){clean=false;}else{clean=true;}
        }

        @Override
        public String ToString() {
            return "Mug:{"+" Main material="+material+", colour="+colour+", Made in="+originCountry+", is full="+full+'}'+"\n";
        }
    }
    public static class Plate extends Dish{

        @Override
        public String ToString() {
            return "Mug:{"+" Main material="+material+", colour="+colour+", Made in="+originCountry+", is clean=" + clean+'}' + "\n";
        }

    }
    public static class Spoon extends Dish{
        private boolean used=false;

        public void Wash(){
            this.clean = true;
            if(clean){used=false;}else{used=true;}
        }

        public void setUsed(boolean used) {
            this.used = used;
            if(used){clean=false;}else{clean=true;}
        }


        @Override
        public String ToString() {
            return "Mug:{"+" Main material="+material+", colour="+colour+", Made in="+originCountry+", is used="+used+", is clean=" + clean +'}'+"\n";
        }

    }
    public static void main(String[]args){
        Mug HuttonMug=new Mug();
        HuttonMug.setDish("Ceramics","grey","HuttonOrbital");
        HuttonMug.setFull(true);
        System.out.println(HuttonMug.ToString());
        HuttonMug.Wash();
        System.out.println(HuttonMug.ToString());

        Plate Frisby=new Plate();
        Frisby.setDish("Plastic","orange","China");
        Frisby.setClean(false);
        System.out.println(Frisby.ToString());
        Frisby.Wash();
        System.out.println(Frisby.ToString());

        Spoon teaspoon=new Spoon();
        teaspoon.setDish("Stainless steel","metallic grey", "Russian Federation");
        teaspoon.setUsed(true);
        System.out.println(teaspoon.ToString());
        teaspoon.Wash();
        System.out.println(teaspoon.ToString());

    }



}
