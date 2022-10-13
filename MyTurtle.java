public class MyTurtle extends BaseTurtle {
    public void desenho() {
        this.square(4);
        this.pause(5);
        this.reset();
        this.circle();

    }

    private void square(double size) {
        pen.setStrokeWidth(10);
        for(int i = 0; i < 4; i++) {
            this.forward(size);
            turn(90);
            pen.setRandomColor();
        }
    }

    private void circle() {
        pen.setColor(255, 255, 0);
        pen.setStrokeWidth(5);
        moveTo(0, -9);
        for(int i = 0; i < 45; i++) {
            this.forward(1);
            this.turn(6.5);
        }
        moveTo(0, 0);
        pen.setColor(0, 0, 0);
        moveBy(-5.5, 3);
    }
}
