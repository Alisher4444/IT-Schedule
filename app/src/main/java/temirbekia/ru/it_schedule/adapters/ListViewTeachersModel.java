package temirbekia.ru.it_schedule.adapters;

import static android.R.attr.id;

/**
 * Created by Kas on 20.10.2016.
 */

public class ListViewTeachersModel {

    private int id;
    private String teacherName;
    private String subject;
    private int teacherImage;

    public ListViewTeachersModel(int id, int teacherImage, String teacherName, String subject)
    {

        this.id= id;
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherImage = teacherImage;
    }



    // set and get Name of the teacher
    public String getTeacherName()
    {
        return teacherName;
    }
    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    // set and get Image ID
    public int getTeacherImage()
    {
        return teacherImage;
    }
    public void setTeacherImage(int teacherImage)
    {
        this.teacherImage = teacherImage;
    }

    // set and get ID or postion of the teacher

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }




    //set and get

    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    public String getSubject()
    {
        return subject;
    }






}
