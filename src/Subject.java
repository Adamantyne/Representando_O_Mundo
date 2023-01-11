public class Subject {
    private String tittle;
    private String[] subtittle;
    private String[] content;
    private int views;

    Subject(String tittle, String[] subtittle, String[] content) {
        this.tittle = tittle;
        this.subtittle = subtittle;
        this.content = content;
        this.views = 0;
    }

    // getters
    public String getTittle() {
        return this.tittle;
    }

    public String[] getSubtittle() {
        return this.subtittle;
    }

    public String[] getContent() {
        return this.content;
    }
    public int getViews(){
        return this.views;
    }

    // setters
    public void setTittle(String newTittle) {
        this.tittle = newTittle;
    }

    public void setSubtittle(String[] newSubtittle) {
        this.subtittle = newSubtittle;
    }

    public void setContent(String[] newContent) {
        this.content = newContent;
    }
    public void setViews(){
        this.views++;
    }
}
