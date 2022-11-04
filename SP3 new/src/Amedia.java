public abstract class Amedia implements Media{
    private int yearOfReleaseMedia;
    private String genreMedia;
    private String typeOfMedia;
    private String nameofMedia;

    @Override
    public int getYearOfReleaseMedia() {
        return yearOfReleaseMedia;
    }

    @Override
    public String getGenreMedia() {
        return genreMedia;
    }

    @Override
    public String getTypeOfMedia() {
        return typeOfMedia;
    }

    public String getNameofMedia() {
        return nameofMedia;
    }
}
