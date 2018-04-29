package Items;

public class SmallCube extends Resource{
    //joe luvs u
    private SmallCubeColor color;

    //constructor
    public SmallCube (SmallCubeColor color){
        this.color = color;
    }

    public SmallCubeColor getColor(){
        return this.color;
    }
    public void setColor(SmallCubeColor color){
        this.color = color;
    }
}
