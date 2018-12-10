import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2018-10-09 15:27
 */
public class DebugTest {

    public static void main(String[] args){

        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

        Map map = new HashMap();
        map.put("1","abc");
        map.put("2","tom");
        map.put("3","jerry");
        map.put("4","bob");
        map.put("5","job");
        System.out.println(map.get("5"));
        System.out.println(map);
    }
}
