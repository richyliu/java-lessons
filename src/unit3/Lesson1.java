package unit3;

import apcs.Window;

public class Lesson1 {

	public static void main(String[] args) {
		Window.out.background("white");
        while (true) {
//            Window.frame();
            
//            if (Window.key.pressed(' ')) {
//                Window.out.background("white");
//            }
//            if (Window.key.pressed('a')) {
//                Window.out.background("red");
//            }
//            if (Window.key.pressed('s')) {
//                Window.out.background("yellow");
//            }
//            if (Window.key.pressed('d')) {
//                Window.out.background("green");
//            }
//            if (Window.key.pressed('f')) {
//                Window.out.background("blue");
//            }
            
            if (Window.key.pressed('q')) {
                Window.out.square(Window.mouse.getX(), Window.mouse.getY(), 25);
	            if(Window.key.pressed('w')) {
	                Window.out.circle(Window.mouse.getX(), Window.mouse.getY(), 12);
	            }
            }
            //Not sure if this is what you meant
            
            if (Window.key.pressed('a')) {
                Window.out.color("red");
                Window.out.circle(Window.mouse.getX(), Window.mouse.getY(), 12);
            }
            if (Window.key.pressed('s')) {
                Window.out.color("yellow");
                Window.out.circle(Window.mouse.getX(), Window.mouse.getY(), 12);
            }
            if (Window.key.pressed('d')) {
                Window.out.color("green");
                Window.out.circle(Window.mouse.getX(), Window.mouse.getY(), 12);
            }
            if (Window.key.pressed('f')) {
                Window.out.color("blue");
                Window.out.circle(Window.mouse.getX(), Window.mouse.getY(), 12);
            }
            if (Window.mouse.clicked()) {
                Window.out.color("black");
                Window.out.circle(Window.mouse.getX(), Window.mouse.getY(), 12);
            }
        }
	}

}
