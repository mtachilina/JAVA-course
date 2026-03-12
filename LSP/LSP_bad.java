public class LSP_bad {
    static class Rectangle {
        protected int width;
        protected int height;

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

        public int getArea() {
            return width * height;
        }
    }

    static class Square extends Rectangle {
        public Square(int side) {
            super(side, side);
        }

        @Override
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width);
        }

        @Override
        public void setHeight(int height) {
            super.setWidth(height);
            super.setHeight(height);
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        Rectangle square = new Square(2);
        
        rect.setWidth(5);
        rect.setHeight(4);
        System.out.println("Rectangle area: " + rect.getArea());
        
        square.setWidth(5);
        square.setHeight(4);
        System.out.println("Square area: " + square.getArea() + " (Expected 20)");
    }
}