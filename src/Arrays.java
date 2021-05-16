import java.lang.reflect.Array;

public class Arrays {
    public int[] numbers;

    //Constructor to create Array object and initially the array does not have any size
    public Arrays() {
        this.numbers = new int[0];
    }

    //this method is to push data into array
    public void input(int number) {
        if(this.numbers.length == 0){
            int[] newNumbers = new int[this.numbers.length + 1];
            newNumbers[this.numbers.length] = number;
            this.numbers = newNumbers;
        }
        else{
            int[] newNumbers = new int[this.numbers.length + 1];
            for(int i = 0; i< this.numbers.length; i++){
                newNumbers[i] = this.numbers[i];
            }
            newNumbers[this.numbers.length] = number;
            this.numbers = newNumbers;
        }
    }

    //this method to remove data by indexing
     public void remove(int index){
        for(int i = index; i < this.numbers.length - 1; i ++){
            this.numbers[i] = this.numbers[i+1];
        }
        int[] newNumbers = new int[this.numbers.length - 1];
        for(int i = 0; i< this.numbers.length - 1; i++){
            newNumbers[i] = this.numbers[i];
        }
        this.numbers = newNumbers;
     }

     //this method is to add numbers in any position
    public void inputAt(int index, int number){
        int[] newNumbers = new int[this.numbers.length + 1];
        for(int i =0; i < newNumbers.length; i++){
            if(i < index){
                newNumbers[i] = this.numbers[i];
            }
            else if(i == index){
                newNumbers[i] = number;
            }
            else{
                newNumbers[i] = this.numbers[i - 1];
            }
        }
        this.numbers = newNumbers;
    }

    //this method is to remove item from any index
    public void removeAt(int index){
        int[] newNumbers = new int[this.numbers.length - 1];
        for(int i = 0; i < this.numbers.length - 1; i++){
            if(i < index){
                newNumbers[i] = this.numbers[i];
            }
            else{
                newNumbers[i] = this.numbers[i+1];
            }
        }
        this.numbers = newNumbers;
    }

    //this method is to find index number of a number
    public int findIndex(int number){
        int index = -1;
        for(int i = 0; i < this.numbers.length; i++){
            if(this.numbers[i] == number){
                index = i;
            }
        }
        return index;
    }

    //this method is to print all data in the array
    public void print(){
        for(int number: this.numbers){
            System.out.println(number);
        }
    }

}
