public class PodcastEpisode extends ContentItem implements Downloadable {

    private String hostName;

    public PodcastEpisode(String title, int year, int durationMinutes, String hostName) {
        super(title, year, durationMinutes);
        this.hostName = hostName;
    }

    public double getLicenseCost(int currentYear) {
        int age = getAge(currentYear);
        int ageFactor;

        if (age <= 2) {
            ageFactor = 3;
        } else {
            ageFactor = 1;
        }

        return 0.03 * durationMinutes + ageFactor;
    }

    public void download() {
        System.out.println("Downloading podcast hosted by " + hostName + "...");
    }

    public int getMaxDownloadsPerDay() {
        return 10;
    }

    public String toString() {
        return super.toString() + ", host=" + hostName;
    }
}
