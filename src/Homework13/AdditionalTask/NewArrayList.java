package Homework13.AdditionalTask;


public class NewArrayList<T> {

    private Object[] list;
    private int numberOfUnits;
    private final int unitSize;

    private int numberOfElements;

    public NewArrayList() {
        this(13);
    }

    public NewArrayList(int setSize) {
        numberOfElements = 0;
        numberOfUnits = 1;
        unitSize = setSize;
        list = new Object[unitSize];
    }

    public void add(T element) {
        if(numberOfElements < list.length) {
            list[numberOfElements] = element;

        } else {
            numberOfUnits++;
            Object[] newList = new Object[unitSize * numberOfUnits];
            if (numberOfElements > 0) {
                System.arraycopy(list, 0, newList, 0, numberOfElements);
            }
            newList[numberOfElements] = element;
            list = newList;
        }
        numberOfElements++;
    }

    public boolean remove(int index) {
        numberOfElements--;
        Object[] newList = new Object[list.length];
        if(list.length > 0 && index > 0 && index < list.length){
            System.arraycopy(list, 0, newList, 0, index);
            System.arraycopy(list, index + 1, newList, index, list.length - index - 1);
        } else {
            return false;
        }
        list = newList;
        return true;
    }

    public T get(int index) {
        if(list.length > 0 && index > 0 && index < list.length) {
            return (T)list[index];
        }
        return null;
    }

    public boolean contains(T object) {
        for(Object listElement : list) {
            if(listElement.equals(object)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        numberOfElements = 0;
        numberOfUnits = 1;
        list = new Object[unitSize];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        for(Object element : list) {
            result.append(element).append("\n");
        }
        return result.append(" ]").toString();
    }
}
