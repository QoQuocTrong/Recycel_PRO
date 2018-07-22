package l.com.recycel_pro.model;

public class Place {
    private String placeImage;
    private String placeName;
    private String placeStar;

    public Place(String placeImage, String placeName, String placeStar) {
        this.placeImage = placeImage;
        this.placeName = placeName;
        this.placeStar = placeStar;
    }

    public String getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(String placeImage) {
        this.placeImage = placeImage;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceStar() {
        return placeStar;
    }

    public void setPlaceStar(String placeStar) {
        this.placeStar = placeStar;
    }
}