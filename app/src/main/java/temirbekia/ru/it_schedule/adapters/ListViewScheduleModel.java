package temirbekia.ru.it_schedule.adapters;


/**
 *
 *
 * Created by Kas on 19.10.2016.
 */

public class ListViewScheduleModel {

    private int id;
    private String day;
    private int scheduleImage;

    public ListViewScheduleModel(int id,  int scheduleImage, String day)
    {
        this.id= id;
        this.day = day;
        this.scheduleImage = scheduleImage;
    }

    public int getId() {
        return id;
    }

    public int getScheduleImage() {
        return scheduleImage;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScheduleImage(int scheduleImage) {
        this.scheduleImage = scheduleImage;
    }
}
