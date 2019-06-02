package com.gaoyuan.springboot.yyz;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnModifitableExampleYao {

    private static final ImmutableMap map= ImmutableMap.builder().put("ss","ss").build();
    private static final List<Long> list=new ArrayList<>();
    private static final List<Long> list1= Collections.unmodifiableList(list);

//    ImmutableList lisss=ImmutableList.builder().add(1).add(2);
}
