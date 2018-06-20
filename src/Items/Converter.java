package Items;

import java.util.HashMap;
import java.util.Map;

public class Converter implements ITradeable {

    PlayerResource playerResource = new PlayerResource();


    public Converter (PlayerResource converter)
    {

    }

    public Map<Resource, Integer> convert(Map<Resource, Integer> resources) {
        //validate
        //change resources

        return resources;
    }

    //SmallBrownCube
    public PlayerResource brownCubeInput(int quant)
    {
        PlayerResource brownCube = new PlayerResource(quant, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0);
        playerResource.subtract(brownCube);
        return playerResource;
    }
    public PlayerResource brownCubeOutput(int quant)
    {
        PlayerResource brownCube = new PlayerResource(quant, 0, 0,0,
                0,0,0,0,0,0,0);
        playerResource.add(brownCube);
        return playerResource;
    }

    //SmallGreenCube
    public PlayerResource greenCubeInput(int quant)
    {
        PlayerResource greenCube = new PlayerResource(0, quant, 0,0,
                0,0,0,0,0,0,0);

        playerResource.subtract(greenCube);
        return playerResource;
    }
    public PlayerResource greenCubeOutput(int quant)
    {
        PlayerResource greenCube = new PlayerResource(0, quant, 0,0,
                0,0,0,0,0,0,0);

        playerResource.add(greenCube);
        return playerResource;
    }

    //SmallWhiteCube
    public PlayerResource whiteCubeInput(int quant)
    {
        PlayerResource whiteCube = new PlayerResource( 0,0, quant,0,
                0,0,0,0,0,0,0);
        playerResource.subtract(whiteCube);
        return playerResource;
    }
    public PlayerResource whiteCubeOutput(int quant)
    {
        PlayerResource whiteCube = new PlayerResource( 0,0, quant,0,
                0,0,0,0,0,0,0);
        playerResource.add(whiteCube);
        return playerResource;
    }

    //SmallGreyCube
    public PlayerResource smallGreyCubeInput(int quant)
    {
        PlayerResource smallGreyCube = new PlayerResource(0, 0, 0, quant,
                0, 0, 0, 0, 0, 0, 0);
        playerResource.subtract(smallGreyCube);
        return playerResource;
    }
    public PlayerResource smallGreyCubeOutput(int quant)
    {
        PlayerResource smallGreyCube = new PlayerResource(0, 0, 0, quant,
                0, 0, 0, 0, 0, 0, 0);
        playerResource.add(smallGreyCube);
        return playerResource;
    }

    //BigBlackCube
    public PlayerResource blackCubeInput(int quant)
    {
        PlayerResource blackCube = new PlayerResource(0,0,0,0,
                quant,0,0,0,0,0,0);
        playerResource.subtract(blackCube);
        return playerResource;
    }
    public PlayerResource blackCubeOutput(int quant)
    {
        PlayerResource blackCube = new PlayerResource(0,0,0,0,
                quant,0,0,0,0,0,0);
        playerResource.add(blackCube);
        return playerResource;
    }

    //BigBlueCube
    public PlayerResource blueCubeInput(int quant)
    {
        PlayerResource blueCube = new PlayerResource(0,0,0,0,
                0,quant,0,0,0,0,0);
        playerResource.subtract(blueCube);
        return playerResource;
    }
    public PlayerResource blueCubeOutput(int quant)
    {
        PlayerResource blueCube = new PlayerResource(0,0,0,0,
                0,quant,0,0,0,0,0);
        playerResource.add(blueCube);
        return playerResource;
    }

    //BigYellowCube
    public PlayerResource yellowCubeInput(int quant)
    {
        PlayerResource yellowCube = new PlayerResource(0,0,0,0,
                0,0,quant,0,0,0,0);
        playerResource.subtract(yellowCube);
        return playerResource;
    }
    public PlayerResource yellowCubeOutput(int quant)
    {
        PlayerResource yellowCube = new PlayerResource(0,0,0,0,
                0,0,quant,0,0,0,0);
        playerResource.add(yellowCube);
        return playerResource;
    }

    //BigGreyCube
    public PlayerResource bigGreyCubeInput(int quant)
    {
        PlayerResource bigGreyCube = new PlayerResource(0,0,0,0,
                0,0,0,quant,0,0,0);
        playerResource.subtract(bigGreyCube);
        return playerResource;
    }
    public PlayerResource bigGreyCubeOutput(int quant)
    {
        PlayerResource bigGreyCube = new PlayerResource(0,0,0,0,
                0,0,0,quant,0,0,0);
        playerResource.add(bigGreyCube);
        return playerResource;
    }

    //UltraTech
    public PlayerResource ultraTechInput(int quant)
    {
        PlayerResource ultraTech = new PlayerResource(0,0,0,0,
                0,0,0,0,quant,0,0);
        playerResource.subtract(ultraTech);
        return playerResource;
    }
    public PlayerResource ultraTechOutput(int quant)
    {
        PlayerResource ultraTech = new PlayerResource(0,0,0,0,
                0,0,0,0,quant,0,0);
        playerResource.add(ultraTech);
        return playerResource;
    }

    //Ships
    public PlayerResource shipInput(int quant)
    {
        PlayerResource ship = new PlayerResource(0,0,0,0,
                0,0,0,0,0,quant,0);
        playerResource.subtract(ship);
        return playerResource;
    }
    public PlayerResource shipOutput(int quant)
    {
        PlayerResource ship = new PlayerResource(0,0,0,0,
                0,0,0,0,0,quant,0);
        playerResource.add(ship);
        return playerResource;
    }

    //VictoryPoints
    public PlayerResource vpInput(int quant)
    {
        PlayerResource vp = new PlayerResource(0,0,0,0,
                0,0,0,0,0,0,quant);
        playerResource.subtract(vp);
        return playerResource;
    }
    public PlayerResource vpOutput(int quant)
    {
        PlayerResource vp = new PlayerResource(0,0,0,0,
                0,0,0,0,0,0,quant);
        playerResource.add(vp);
        return playerResource;
    }

    //Converter
    public Converter converterInput(int quant)
    {
        return playerResource;
    }
}
