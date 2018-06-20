package Items;

import java.util.ArrayList;
import java.util.List;

public class ConverterHolder {

    private List<Converter> bf_converterList = new ArrayList<>();
    private Converter bf_converter = new Converter();

    ConverterHolder(Converter converter)
    {
        this.bf_converter = converter;
    }


}
