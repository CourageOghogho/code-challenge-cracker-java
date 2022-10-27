package dev.decagon.simple;

import java.util.List;

public class FilterOnlyInteger {

        public static List<Object> filterList(final List<Object> list) {
            return list.stream()
                    .filter(item->item.getClass()==Integer.class).toList();


        }
    }
