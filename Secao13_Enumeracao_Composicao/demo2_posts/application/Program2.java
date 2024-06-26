package application;

//import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program2 {

	public static void main(String[] args) throws ParseException {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		LocalDateTime customDateTime = LocalDateTime.of(2024, 06, 17, 14, 30, 26);
		
		// POST 1
		Post post1 = new Post("Estudando Java", "Continuando a aprender sobre composição de classes em Java!", 12);
		
		Comment c1_1 = new Comment("Alairton" ,"Parabéns pelo esforço, Bruno!");
		Comment c1_2 = new Comment("Mariana", "Que legal, Java é tudo de bom kkkkk");
		
		post1.addComment(c1_1);
		post1.addComment(c1_2);
		
		System.out.println(post1.toString());
		
		//POST 2 - passando uma data e hora específicas
		Post post2 = new Post(customDateTime ,"Estudando banco de dados", "Continuando a aprender sobre banco de dados!", 12);
		
		Comment c2_1= new Comment("Matheus", "Parabéns pelo esforço, Bruno!");
		Comment c2_2 = new Comment("Samay", "Que legal, banco de dados é tudo de bom kkkkk");
		
		post2.addComment(c2_1);
		post2.addComment(c2_2);
		
		System.out.println(post2.toString());
	
	}

}
