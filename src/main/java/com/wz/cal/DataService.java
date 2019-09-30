package com.wz.cal;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataService {
    private List<House> houseInitialize(){
        List<House> list=new ArrayList<>();
        return list;
    }

    private List<Relation> relateInitialize(){
        List<Relation> list=new ArrayList<>();
        return list;
    }

    public List<House> cal(Map<String,Integer> stars,Map<String,Integer> policy,Map<String,Integer> mission,Map<String,Integer> missionhouse,Map<String,Integer> photo){
        List<House> houses=houseInitialize();
        List<House> newHouses=new ArrayList<>();

        List<Relation> relations=relateInitialize();
        List<Relation> newRelations=new ArrayList<>();
        Map<String,Double> relate=new HashMap<>();

        Map<Integer,Integer> starToValue=new HashMap<>();
        starToValue.put(0,0);
        starToValue.put(1,1);
        starToValue.put(2,2);
        starToValue.put(3,6);
        starToValue.put(4,24);
        starToValue.put(5,120);

        for (House h:houses){
            int beishu=stars.get(h.getName());
            h.setValue(h.getValue()*beishu);
            newHouses.add(h);
        }

        for (Relation r:relations){
            if (stars.get(r.getId1())==r.getStar()){
//                if (!r.getId2().equals(0)){
//                    if (relate.containsKey(r.getId2()))
//                        relate.put(r.getId2(),relate.get(r.getId2())+r.getValue());
//                    else relate.put(r.getId2(),r.getValue());
//                }else {
//                    if (relate.containsKey(r.getType()))
//                        relate.put(r.getType(),relate.get(r.getType())+r.getValue());
//                    else relate.put(r.getType(),r.getValue());
//                }
                newRelations.add(r);
            }
        }

        return null;
    }
}
