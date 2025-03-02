package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();

        // Find projects where the developer is involved
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                projectList.add(entry.getKey());
            }
        }

        // Sort by length descending, then alphabetically in reverse order
        projectList.sort((a, b) -> {
            int lengthCompare = Integer.compare(b.length(), a.length());
            return lengthCompare != 0 ? lengthCompare : b.compareTo(a);
        });

        return projectList;
    }
}
