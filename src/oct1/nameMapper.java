package oct1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class nameMapper {

        public void map (StudentO o, IResult iResult){
            String fullName = iResult.apply(o);
                System.out.println(fullName);
        }

}
