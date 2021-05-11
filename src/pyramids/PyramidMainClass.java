package pyramids;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PyramidMainClass {

    public static void main(String[] args) throws IOException {

        PyramidCsvDao p1 = new PyramidCsvDao();

        List<Pyramid> outputPyramids = new ArrayList<>();

        outputPyramids = p1.readPyramidsFromCsv("F:\\pyramids.csv");
        
        Collections.sort(outputPyramids, new SortClass());
        
        int i = 1;
        for (Pyramid p :outputPyramids ) { 
           System.out.println("Pyramid #"+(i++)+" - "+p.getPharaoh()+" - " + p.getModern_name()+" - "+p.getSite()+" - "+p.getHeight());}
        
    
    
    Map < String, Integer > NumOfSites= new LinkedHashMap<>();
         for(Pyramid p : outputPyramids)
         {
             String site = p.getSite();
             Integer count = NumOfSites.get(site);
             if (count == null )
             { 
                 count =1;
             }
             else {
                 count++;
             } 
             NumOfSites.put(site, count);
         } 
                
           System.out.println("\n"+NumOfSites);  

    }

}
