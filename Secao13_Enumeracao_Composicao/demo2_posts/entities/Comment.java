package entities;

public class Comment {
	
	// atributos
	private String name;
	private String text;
	
	// construtor
	public Comment() { 
		
	}

	public Comment(String name, String text) {
		this.name = name;
		this.text = text;
	}

	// getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
