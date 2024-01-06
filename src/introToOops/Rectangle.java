package introToOops;

class Point {
    // write the code of point class here
    int x;
    int y;
}public class Rectangle {
    // write the code of rectangle class here
    Point topLeft;
    int height;
    int width;
    int getArea() { return this.height*this.width; }
    int getPerimeter() { return 2*(this.height+this.width); }
    Point getBottomRight() {
        Point ans = new Point();
        ans.x = this.topLeft.x + this.width;
        ans.y = this.topLeft.y - this.height;
        return ans;
    }
}