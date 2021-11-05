package com.lists.concatenate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatLists {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("One","Two"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Three","Four"));
        List<String> list3 = new ArrayList<>(Arrays.asList("Five","Six"));
        System.out.println(getConcatList(list1, list2, list3));
    }
	
	public static List<String> getConcatList(List<String> list1, List<String> list2, List<String> list3) {
        return Stream.of(list1, list2, list3).flatMap(Collection::stream).collect(Collectors.toList());
    }

}
