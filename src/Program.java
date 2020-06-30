import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		//
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment fistComment = new Comment("Have a nice trip");
		Comment secondComment = new Comment("Wow that's awesome!");
		
		Post onePost = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);
		
		onePost.addComment(fistComment);
		onePost.addComment(secondComment);
		
		Comment thirdComment = new Comment("Good night");
		Comment fourthComment = new Comment("May the Force be with you");
		
		Post twoPost = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow", 5);
		
		twoPost.addComment(thirdComment);
		twoPost.addComment(fourthComment);
		
		System.out.println(onePost);
		System.out.println(twoPost);
		
	}

}
