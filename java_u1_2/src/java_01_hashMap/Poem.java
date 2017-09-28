package java_01_hashMap;

public class Poem {
	private String auto;
	private String title;
	private String content;
	public Poem(String auto, String title, String content) {
		this.auto = auto;
		this.title = title;
		this.content = content;
	}
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
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
}
