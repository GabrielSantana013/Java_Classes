package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;

import static entities.Post.sdf1;


public class ProgramExercicio2 {

    public static void main(String[] args) throws ParseException {


        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome!");
        Post p1 = new Post(sdf1.parse("21/06/2018 13:05:44"),
                "Traveling to New Zeland",
                "I'm going to visit this wonderful country!",
                12);

        p1.addComent(c1);
        p1.addComent(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(sdf1.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you Tomorrow",
                5);

        p2.addComent(c3);
        p2.addComent(c4);
        System.out.println(p1);
        System.out.println(p2);

    }
}
