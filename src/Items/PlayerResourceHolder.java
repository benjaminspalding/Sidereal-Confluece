package Items;

public class PlayerResourceHolder {

    private Resource bf_resource;
    private Integer bf_dracula;

    //named resource because resources and dracula because its the count
    PlayerResourceHolder(Resource resource, Integer dracula)
    {
        this.bf_resource = resource;
        this.bf_dracula = dracula;
    }

    //getter methods
    public Resource GetResource()
    {
        return this.bf_resource;
    }

    public Integer getCount()
    {
        return this.bf_dracula;
    }

    //setter methods
    public void setResource (Resource resource)
    {
        this.bf_resource = resource;
    }

    public void setCount (Integer dracula)
    {
        this.bf_dracula = dracula;
    }
}
