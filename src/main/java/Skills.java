import java.io.Serializable;

public class Skills implements Serializable {
    private int javaSkill;
    private int htmlSkill;
    private int cssSkill;
    private int jsSkill;

    // Communication Skill
    private int commSkill;

    // TeamWork Skill
    private int twSkill;

    // Creativity Skill
    private int crSkill;

    public Skills() {
        this.javaSkill  = 0;
        this.htmlSkill  = 0;
        this.cssSkill   = 0;
        this.jsSkill    = 0;

        this.commSkill  = 0;
        this.twSkill    = 0;
        this.crSkill    = 0;
    }

    public int getJavaSkill() {
        return javaSkill;
    }

    public void setJavaSkill(int javaSkill) {
        this.javaSkill = javaSkill;
    }

    public int getHtmlSkill() {
        return htmlSkill;
    }

    public void setHtmlSkill(int htmlSkill) {
        this.htmlSkill = htmlSkill;
    }

    public int getCssSkill() {
        return cssSkill;
    }

    public void setCssSkill(int cssSkill) {
        this.cssSkill = cssSkill;
    }

    public int getJsSkill() {
        return jsSkill;
    }

    public void setJsSkill(int jsSkill) {
        this.jsSkill = jsSkill;
    }

    public int getCommSkill() {
        return commSkill;
    }

    public void setCommSkill(int commSkill) {
        this.commSkill = commSkill;
    }

    public int getTwSkill() {
        return twSkill;
    }

    public void setTwSkill(int twSkill) {
        this.twSkill = twSkill;
    }

    public int getCrSkill() {
        return crSkill;
    }

    public void setCrSkill(int crSkill) {
        this.crSkill = crSkill;
    }
}
