package Homework2.Lesson1;

public class App {

    public static void main(String[] args) {

        Athletics[] athletics = {
                new Human(300, 400),
                new Cat(200, 500),
                new Robot(400, 600)
        };

        Crossable[] crossables = {
                new RunningTrack(500),
                new Wall(2000),
                new RunningTrack(200),
                new Wall(400)
        };

        for (Athletics athletic : athletics) {
            for (Crossable crossable : crossables) {
                crossable.cross(athletic);
            }
        }


    }
}
