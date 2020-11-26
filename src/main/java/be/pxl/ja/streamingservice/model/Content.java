package be.pxl.ja.streamingservice.model;

public abstract class Content {
    private String title;
    private H1.Rating maturityRating;

    public Content(String title, H1.Rating maturityRating) {
        this.title = title;
        this.maturityRating = maturityRating;
    }

    public String getTitle() {
        return title;
    }

    public H1.Rating getMaturityRating() {
        return maturityRating;
    }

    @Override
    public String toString() {
        return title;
    }
}
