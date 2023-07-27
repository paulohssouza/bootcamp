package dio.bootcamp.paulohenrique;

import dio.bootcamp.paulohenrique.domain.Course;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java OO", "Curso de Java orientado a objetos", 22);
        System.out.println(course);
    }
}