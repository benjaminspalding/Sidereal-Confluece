package Items;

import java.util.HashMap;
import java.util.Map;

public class PlayerResource {

    private Map<Resource, Integer> resources = new HashMap<>();

    PlayerResource(){
        resources.put(new SmallCube(SmallCubeColor.BROWN), 0); // <- do this for all cubes
        resources.put((new SmallCube(SmallCubeColor.GREEN), 0);
        resources.put(new SmallCube(SmallCubeColor.WHITE), 0);
        resources.put(new SmallCube(SmallCubeColor.GREY), 0);
        resources.put(new BigCube(BigCubeColor.BLACK), 0);
        resources.put(new BigCube(BigCubeColor.BLUE), 0);
        resources.put(new BigCube(BigCubeColor.YELLOY), 0);
        resources.put(new BigCube(BigCubeColor.GREY), 0);
        resources.put(new Ultratech(), 0);
        resources.put(new Ship(), 0);
        resources.put(new VictoryPoint(), 0);

    }

    public PlayerResource add(){
        //TODO: implement adding, the method header and definition are not complete.
        //  This might be a little bit of work.

        // putall method. Figure out houw to put hashmaps as arguments

        return null;
    }

    public PlayerResource subtract(){
        //read comments on add.


        return null;
    }

}
