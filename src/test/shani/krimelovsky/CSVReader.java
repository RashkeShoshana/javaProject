package test.shani.krimelovsky;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private static List<String> convertLineToRow(String line) {
        List<String> rows=new ArrayList<>();
        String row="";
        int first=0,last=line.indexOf(',');
        while(last!=-1) {
            row=line.substring(first,last);
            rows.add(row);
            first=last+1;
            last=line.indexOf(',',last+1);
        }
        row=line.substring(first,line.length()-1);
        rows.add(row);
        return rows;
    }
    static List<List<String>> readFileRows(String path){
        List<List<String>> lines=new ArrayList<>();
        try (DataInputStream input = new DataInputStream(new
                BufferedInputStream(new FileInputStream(path)))) {
            try {
                String line = input.readLine();
                while (line!=null) {
                    lines.add(convertLineToRow(line));
                    line = input.readLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
