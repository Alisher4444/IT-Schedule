package temirbekia.ru.it_schedule.adapters;

/**
 * Created by Kas on 18.10.2016.
 */

public class ListViewModel {
    private int id;
    private String groupStream;
    private String groupName;
    private int idImage;
    public ListViewModel(int id, int idImage, String groupName, String groupStream)
    {
        this.id = id;
        this.idImage = idImage;
        this.groupName = groupName;
        this.groupStream = groupStream;
    }

    // set and get Name of the group
    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }
    public String getGroupName()
    {
        return groupName;
    }

    // set and get Image ID

    public void setIdImage(int idImage)
    {
        this.idImage = idImage;
    }

    public int getIdImage()
    {
        return idImage;
    }

    // set and get ID or postion of the group
    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    //set and get of Stream group

    public void setGroupStream(String groupStream)
    {
        this.groupStream = groupStream;
    }

    public String getGroupStream()
    {
        return groupStream;
    }
}