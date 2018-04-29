package Items;

public class BigCube extends Resource {
    private BigCubeColor color;

    public BigCube(BigCubeColor color)
    {
        this.color = color;
    }

    public BigCubeColor getColor(){
        return this.color;
    }

    public  void setColor(BigCubeColor color){
        this.color = color;
    }

}
