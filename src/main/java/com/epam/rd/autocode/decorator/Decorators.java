package com.epam.rd.autocode.decorator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Decorators {
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        return sourceList.stream().filter(s -> sourceList.indexOf(s) % 2 == 0).collect(Collectors.toList());
//
//                return new AbstractList<>(){
//                    private List<String> list = new ArrayList<>();
//                    private int size;
//
//                    {
//                        for(int i = 0; i < sourceList.size(); i++){
//                            if(i % 2 != 0)
//                                continue;
//                            list.add(sourceList.get(i));
//                            size++;
//                        }
//                    }
//
//                    @Override
//                    public int size() {
//                        return size;
//                    }
//
//                    @Override
//                    public String get(int index) {
//                        return list.get(index);
//                    }
//
//                    @Override
//                    public Iterator<String> iterator(){
//                        return list.iterator();
//                    }
//                };


        //    return new DecoratorImpl(sourceList);

    }
}