package Items;

import java.util.*;


public class PlayerResource {

    private LinkedHashMap<Resource, Integer> resources = new LinkedHashMap<>();


    PlayerResource(){
        resources.put(new SmallCube(SmallCubeColor.BROWN), 0);
        resources.put(new SmallCube(SmallCubeColor.GREEN), 0);
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


    PlayerResource(int smlBrownCube, int smlGreenCube, int smlWhiteCube, int smlGreyCube,
                   int bigBlackCube, int bigBlueCube, int bigYellowCube, int bigGreyCube,
                   int ultraTech, int ships, int vp){
        resources.put(new SmallCube(SmallCubeColor.BROWN), smlBrownCube);
        resources.put(new SmallCube(SmallCubeColor.GREEN), smlGreenCube);
        resources.put(new SmallCube(SmallCubeColor.WHITE), smlWhiteCube);
        resources.put(new SmallCube(SmallCubeColor.GREY), smlGreyCube);
        resources.put(new BigCube(BigCubeColor.BLACK), bigBlackCube);
        resources.put(new BigCube(BigCubeColor.BLUE), bigBlueCube);
        resources.put(new BigCube(BigCubeColor.YELLOY), bigYellowCube);
        resources.put(new BigCube(BigCubeColor.GREY), bigGreyCube);
        resources.put(new Ultratech(), ultraTech);
        resources.put(new Ship(), ships);
        resources.put(new VictoryPoint(), vp);
    }

    // This is private so that we don't expose the map backing field to the world
    private LinkedHashMap<Resource, Integer> getPlayerResourceMap(){
        return resources;
    }

    public PlayerResource add(PlayerResource reqRes){
        //TODO: implement adding, the method header and definition are not complete.
        //  This might be a little bit of work.

        //declaring variables for iterating over the loop
        Set<Resource> resourceKeys = resources.keySet();
        Collection<Integer> resourceVals = resources.values();

        //use a real for loop pussy
        for(Resource keys:resourceKeys){

        }

            return null;

    }

    public PlayerResource subtract(){
        //read comments on add.


        return null;
    }

}
