public  class Amedia implements Media{
    private int yearOfReleaseMedia;
    private String genreMedia;

    private String nameofMedia;
    private float rating;



    public Amedia(String nameofMedia,int yearOfReleaseMedia, String genreMedia, float rating) {
        this.yearOfReleaseMedia = yearOfReleaseMedia;
        this.genreMedia = genreMedia;
        this.nameofMedia = nameofMedia;
        this.rating = rating;
    }

    @Override
    public String getNameMedia() {
        return null;
    }

    @Override
    public int getYearOfReleaseMedia() {
        return yearOfReleaseMedia;
    }

    @Override
    public String getGenreMedia() {
        return genreMedia;
    }

 public float getRating(){
        return rating;
 }

}
