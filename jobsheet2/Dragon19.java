

public class Dragon19 {
    int x, y, width, height;
    public Dragon19(int x1, int y1, int w, int h){
        x = x1;
        y = y1;
        width = w;
        height = h;
    }
    void moveLeft(){
        if(x>0)
            x = x-1;
        printPosition();
        detectCollision();
    }
    void moveRight(){
        if(x<width)
            x = x+1;
        printPosition();
        detectCollision();
    }
    void moveUp(){
        if(y>0)
            y = y-1;
        printPosition();
        detectCollision();
    }
    void moveDown(){
        if(y<height)
            y = y+1;
        printPosition();
        detectCollision();
    }
    void printPosition(){
        System.out.printf("(%d, %d)\n",x,y);
    }
    void detectCollision(){
        if(x<=0 || y<=0 || x>=width|| y>=height)
            System.out.println("Game Over");
    }
    public static void main(String[] args) {
        Dragon19 d = new Dragon19(10,10,25,35);
        d.printPosition();
        d.moveRight();d.moveDown();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
        d.moveLeft();
    }
}