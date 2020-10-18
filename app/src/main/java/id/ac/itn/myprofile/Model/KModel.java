package id.ac.itn.myprofile.Model;

public class KModel {
    String title, dessription, date;
    int image;

    public KModel(String title, String dessription, String date, int image) {
        this.title = title;
        this.dessription = dessription;
        this.date = date;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDessription() {
        return dessription;
    }

    public void setDessription(String dessription) {
        this.dessription = dessription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
