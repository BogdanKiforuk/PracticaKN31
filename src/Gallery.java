import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private List<Picture> pictures;
    private String name;
    private String article;
    private static Gallery instance;

    private Gallery(String name) {
        this.name = name;
        this.pictures = new ArrayList<>();
    }

    public static Gallery getInstance(String name) {
        if (instance == null) {
            instance = new Gallery(name);
        }
        return instance;
    }

    public boolean addPicture(Picture picture) {
        return pictures.add(picture);
    }

    public boolean removePicture(Picture picture) {
        return pictures.remove(picture);
    }

    public String describePicture(Picture picture) {
        if (pictures.contains(picture)) {
            return picture.toString();
        }
        return "Picture not found in gallery.";
    }

    public Picture getPicture(String name) {
        for (Picture picture : pictures) {
            if (picture.getName().equals(name)) {
                return picture;
            }
        }
        return null;
    }

    public List<Picture> getPictures() {
        return new ArrayList<>(pictures);
    }

    public int getPictureCount() {
        return pictures.size();
    }

    public String getName() {
        return name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Gallery get() {
        return null;
    }
}