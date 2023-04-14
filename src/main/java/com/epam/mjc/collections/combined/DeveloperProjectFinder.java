package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        ArrayList<String> developerProjects = new ArrayList<>();
        for (String i : projects.keySet()) {
            if (projects.get(i).contains(developer)) developerProjects.add(i);
        }
        developerProjects.sort(new MyProjectNamesComparator());
        return developerProjects;
    }

    class MyProjectNamesComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() == o2.length()) {
                return o2.compareTo(o1);
            } else if (o1.length() > o2.length()) return -1;
            else return 1;
        }
    }
}
