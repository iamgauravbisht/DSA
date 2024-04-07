package arrays;

public class OwnArray {
    private int[] item;
    private int currentIndex;

    public OwnArray(int initialize){
        this.item = new int[initialize];
        this.currentIndex = 0;
    }

    public void Insert(int value) {

        if(this.currentIndex == this.item.length){
            int[] newArray = new int[this.item.length*2];
            for(int i=0;i<this.item.length;i++){
                newArray[i] = this.item[i];
            }
            this.item = newArray;
            // System.out.println("Array size increased");
        }

        this.item[currentIndex] = value;
        this.currentIndex++;
    }

    public int indexOf(int value){
        for(int i=0;i<currentIndex;i++){
            if(item[i]==value){
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index){
        for(int i = index; i<this.currentIndex-1 ;i++){
            this.item[i] = this.item[i+1];
        }
        this.currentIndex--;
        this.item[currentIndex] = 0;
    }

    public int max(){
        int max = this.item[0];
        for (int index = 1; index < this.currentIndex; index++) {
            if (this.item[index] > max) {
                max = this.item[index];
            }
        }
        return max;
    }

    public int min(){
        int min = this.item[0];
        for (int index = 1; index < this.currentIndex; index++) {
            if (this.item[index] < min) {
                min = this.item[index];
            }
        }
        return min;
    }

    public void reverse(){
        int i=0;
        int j=this.currentIndex-1;
        while(i<j){
            int temp = this.item[i];
            this.item[i] = this.item[j];
            this.item[j] = temp;
            i++;
            j--;
        }
    }

    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.currentIndex; i++){
            sb.append(this.item[i]).append(", ");
            
        }
        sb.append('\b').append('\b').append("]");
        return sb.toString();
    }
}
