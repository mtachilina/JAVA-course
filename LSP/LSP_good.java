public class LSP_good {
    interface Shape {
        int getArea();
    }

    static class Rectangle implements Shape {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int getArea() {
            return width * height;
        }
    }

    static class Square implements Shape {
        private int side;

        public Square(int side) {
            this.side = side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public int getArea() {
            return side * side;
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        Square sq = new Square(5);
        
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Square area: " + sq.getArea());
    }
}