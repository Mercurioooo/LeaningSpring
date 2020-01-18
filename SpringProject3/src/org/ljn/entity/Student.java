package org.ljn.entity;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	Set<Integer> set;
	List<Integer> list;
	int [] array = new int[3];
	Map<Integer,String> map ;
	public Set<Integer> getSet() {
		return set;
	}
	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer,String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Student [set=" + set + ", list=" + list + ", array=" + Arrays.toString(array) + ", map=" + map + "]";
	}

}
