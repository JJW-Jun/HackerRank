//package demo.book.coderefactoring.chapter8.goodcode;
//
//import demo.book.coderefactoring.chapter8.badecode.ShapeLine;
//import demo.book.coderefactoring.chapter8.badecode.ShapeOval;
//import demo.book.coderefactoring.chapter8.badecode.ShapeRectangle;
//
//public abstract class ShapeFactory {
//
//    public abstract Shape create(int startx, int starty, int ends, int endy);
//
//    public static class LineFactory extends ShapeFactory {
//        private static final ShapeFactory factory = new LineFactory();
//
//        private LineFactory() {
//        }
//
//        public static ShapeFactory getInstance() {
//            return factory;
//        }
//
//        public Shape create(int startx, int starty, int endx, int endy) {
//            return new ShapeLine(startx, starty, endx, endy);
//        }
//    }
//
//    public static class RectangleFactory extends ShapeFactory {
//        private static final ShapeFactory factory = new RectangleFactory();
//
//        private RectangleFactory() {
//        }
//
//        public static ShapeFactory getInstance() {
//            return factory;
//        }
//
//        public Shape create(int startx, int starty, int endx, int endy) {
//            return new ShapeRectangle(startx, starty, endx, endy);
//        }
//    }
//
//
//    public static class OvalFactory extends ShapeFactory {
//        private static final ShapeFactory factory = new OvalFactory();
//
//        private OvalFactory() {
//        }
//
//        public static ShapeFactory getInstance() {
//            return factory;
//        }
//
//        public Shape create(int startx, int starty, int endx, int endy) {
//            return new ShapeOval(startx, starty, endx, endy);
//        }
//    }
//
//
//}
