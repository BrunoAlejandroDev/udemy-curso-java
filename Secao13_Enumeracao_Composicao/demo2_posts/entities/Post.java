package entities;

//import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Post {
	
	// atributos
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer like;
	private final List<Comment> comments; // normalmente, coleções não recebem o setter, mas sim métodos de adicionar e remover
	
	// Classe para formatação das datas dos posts
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	// inicio construtores
	public Post(String title, String content, Integer like) {
		this.title = title;
		this.content = content;
		
		if (like < 0) {
			this.like = 0;			
		}
		else {
			this.like = like;
		}
		
		this.moment = LocalDateTime.now(); // obter data e hora atual
		this.comments = new ArrayList<>(); // inicializar a lista de comentários p/ cada post
	} 
	
	public Post(LocalDateTime moment, String title, String content, Integer like) {
        this.title = title;
        this.content = content;
        this.moment = moment;
        
        if (like < 0) {
            this.like = 0;
        } 
        else {
            this.like = like;
        }
        
        this.comments = new ArrayList<>();
	}
	
	public Post() {
		this.comments = null;
	}
	// fim construtores
	
	// inicio metodos publicos
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	// fim metodos publicos
	
	// inicio toString
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTitle() + "\n");
		sb.append(this.getContent() + "\n");
		
		sb.append(this.getLike());
		sb.append(" Likes - ");
		sb.append(this.getFormattedMoment()).append("\n\n");
		
		sb.append("Comments:" + "\n");
		for (Comment c : comments) {
			sb.append(c.getName() + " - ");
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
	
	
	// inicio getters e setters
	public String getFormattedMoment() {
		return moment.format(dateFormatter);
	}

//	public void setMoment(Date moment) {
//		this.moment = moment;
//	}
	
	public LocalDateTime getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		if (like < 0) {
			this.like = 0;			
		}
		else {
			this.like = like;
		}
	}

	public List<Comment> getComments() {
		return Collections.unmodifiableList(comments);
	}	
	// fim getters e setters
	
}
