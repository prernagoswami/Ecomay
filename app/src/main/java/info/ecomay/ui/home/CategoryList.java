package info.ecomay.ui.home;

public class CategoryList {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategoryID() {
        return category;
    }

    public void setCategoryID(int category) {
        this.category = category;
    }

    String name,image;
    int category;
}
