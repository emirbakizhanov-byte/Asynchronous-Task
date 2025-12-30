import java.util.ArrayList;

public class ContentDemo {

    public static void main(String[] args) {

        ArrayList<ContentItem> list = new ArrayList<>();

        list.add(new VideoLecture("Java", 2024, 60, "HD"));
        list.add(new PodcastEpisode("Podcast", 2023, 30, "Alex"));

        int year = 2025;

        for (ContentItem c : list) {
            System.out.println(c);
            System.out.println(c.getLicenseCost(year));

            if (c instanceof Downloadable) {
                Downloadable d = (Downloadable) c;
                d.download();
            }

            System.out.println();
        }
    }
}

