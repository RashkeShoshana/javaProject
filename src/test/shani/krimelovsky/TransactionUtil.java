package test.shani.krimelovsky;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionUtil {
    private static final String filePath="C:/transactions.csv";
    private static Map<School, List<Transaction>> buildSchoolsMap(){
        List<List<String>>  lines=CSVReader.readFileRows(filePath);
        Map<School, List<Transaction>> map=new HashMap<>();
        for(int i=1;i<lines.size();i++){
//
            School school=new
                    School(lines.get(i).get(0),lines.get(i).get(1));
            map.put(school,new ArrayList<>());
            Transaction trans=new
                    Transaction(lines.get(i).get(2),lines.get(i).get(3),lines.get(i).get(4),
                    lines.get(i).get(5),lines.get(i).get(0));
            map.get(school).add(trans);
        }
        return map;
    }
    public static School maxSchoolForMonth(Month month, int year) {
        Map<School, List<Transaction>>  map = buildSchoolsMap();
        int max = 0;
        School maxSchool = null;
        for (Map.Entry<School, List<Transaction>> entry :
                map.entrySet()) {
            School school = entry.getKey();
            List<Transaction> transactions = entry.getValue();
            int sum = 0;
            for (int i = 0; i <transactions.size(); i++) {
                if(transactions.get(i).getDate().getMonth() == month &&
                        transactions.get(i).getDate().getYear() == year) {
                    sum++;
                }
            }
            if (sum > max) {
                max = sum;
                maxSchool = school;
            }
        }
        return maxSchool;
    }
}
