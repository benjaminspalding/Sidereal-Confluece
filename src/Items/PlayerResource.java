package Items;

import java.util.*;


public class PlayerResource {

    private List<PlayerResourceHolder> list_Items;

    //constructor with everything zero'd out
    PlayerResource(List<PlayerResourceHolder> items)
    {
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.BROWN), 0));
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.GREEN), 0));
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.WHITE), 0));
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.GREY),0));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.BLACK),0));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.BLUE), 0));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.YELLOY), 0));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.GREY), 0));
        items.add(new PlayerResourceHolder(new Ultratech(), 0));
        items.add(new PlayerResourceHolder(new Ship(), 0));
        items.add(new PlayerResourceHolder(new VictoryPoint(), 0));
    }

    //constructor with everything as variables
    PlayerResource(List<PlayerResourceHolder> items, Integer smallBrownCube, Integer smallGreenCube,
                   Integer smallWhiteCube, Integer smallGreyCube, Integer bigBlackCube, Integer bigBlueCube,
                   Integer bigYellowCube, Integer bigGreyCube, Integer ultraTech, Integer ships, Integer vp)
    {
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.BROWN), smallBrownCube));
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.GREEN), smallGreenCube));
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.WHITE), smallWhiteCube));
        items.add(new PlayerResourceHolder(new SmallCube(SmallCubeColor.GREY),smallGreyCube));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.BLACK),bigBlackCube));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.BLUE), bigBlueCube));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.YELLOY), bigYellowCube));
        items.add(new PlayerResourceHolder(new BigCube(BigCubeColor.GREY), bigGreyCube));
        items.add(new PlayerResourceHolder(new Ultratech(), ultraTech));
        items.add(new PlayerResourceHolder(new Ship(), ships));
        items.add(new PlayerResourceHolder(new VictoryPoint(), vp));
    }


    // This is private so that we don't expose the map backing field to the world
    private List<PlayerResourceHolder> getPlayerResource(){
        return items;
    }

    public List<PlayerResourceHolder> add(List<PlayerResourceHolder> reqRes){

        for(int i = 0; i < list_Items.size(); i++)
        {
            int reqResCount = reqRes.get(i).getCount();
            int list_ItemsCount = list_Items.get(i).getCount();

            reqResCount = reqResCount + list_ItemsCount;
            list_Items.get(i).setCount(reqResCount);
        }

            return list_Items;

    }

    public List<PlayerResourceHolder> subtract(List<PlayerResourceHolder> reqRes){

        for(int i = 0; i < list_Items.size(); i++)
        {
            int reqResCount = reqRes.get(i).getCount();
            int list_ItemsCount = list_Items.get(i).getCount();

            reqResCount = reqResCount - list_ItemsCount;
            list_Items.get(i).setCount(reqResCount);
        }

        return list_Items;
    }

}
