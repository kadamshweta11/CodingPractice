import java.util.*;
public class sortMap{
  Map<String,String>unsorted=new HashMap<>();
  unsorted.put("1","car");
   unsorted.put("2","bike");
   unsorted.put("3","auto");
   unsorted.put("4","taxi");
  for(Map.Entry<String,String>entry:unsorted.entrySet()){
    System.out.println("unsorted key value="+entry.getKey());
  }
  Map<Srting,String>tree=new TreeMap<String,String>(unsorted);
   for(Map.Entry<String,String>entry:tree.entrySet()){
    System.out.println("sorted key value="+entry.getKey());
  }
}
