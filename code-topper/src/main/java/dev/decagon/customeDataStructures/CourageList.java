package dev.decagon.customeDataStructures;

public class CourageList {

    private int  []items;
    private  int index;
    CourageList(int initialSize){
        items = new int[initialSize];
    }
    //get
    public int size(){
        return items.length;
    }
    public  int[] get(){
        return  items;
    }
    //add item
    public void add(int item) {
        if(index == items.length) {
            int []newItems= new int[1+index];
            for(int i=0; i<index; i++){
                newItems[i]=items[i];
            }
            newItems[newItems.length-1]=item; //O(1)
            items =newItems;
        } else {
            items[index] = item;
        }
        index++;
    }
    //delete item
    public void delete(int idx) {
        if (idx < index && idx>=0) {
            int[] newItems = new int[index - 1];
            for (int i = 0, j = 0; i < index; i++) {
                if (i == idx)
                    continue;
                newItems[j] = items[i];
                j++;
            }
            items = newItems;
            index--;
        }
    }
    //find item
    public int find(int idx){
        int result=-1;
        if (idx < index && idx>=0) {
            //O(n) linear,
            for (int i = 0; i < index; i++) {
                if (i == idx)
                    result= items[i];
            }
        }
        return result;
    }
    //contains
    public  boolean contains(int val) {
        boolean result = false;
        for (int i = 0; i < index; i++) {
            if (items[i] ==val)
                result = true;
        }
        return result;
    }
    //find by value
    //delete by value
}
