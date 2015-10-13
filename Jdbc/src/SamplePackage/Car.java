package SamplePackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Car {

	ArrayList<String> personNameList = new ArrayList<String>();
	Map<String, ArrayList<String>> carInfo = new HashMap<String, ArrayList<String>>();
	Set<Integer> ids = new TreeSet<Integer>();

	public ArrayList<String> getPersonNameList() {
		return personNameList;
	}

	public void setPersonNameList(ArrayList<String> personNameList) {
		this.personNameList = personNameList;
	}

	public Map<String, ArrayList<String>> getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(Map<String, ArrayList<String>> carInfo) {
		this.carInfo = carInfo;
	}

	public Set<Integer> getIds() {
		return ids;
	}

	public void setIds(Set<Integer> ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "Car [personNameList=" + personNameList + ", carInfo=" + carInfo + ", ids=" + ids + "]";
	}

}
