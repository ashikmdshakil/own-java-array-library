import java.lang.reflect.Array;

public class Arrays {
    public int[] numbers;
    public int count;

    public Arrays() {
        this.numbers = new int[0];
    }

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

     public void remove(int index){
        this.numbers[index] = 0;
     }

    public void print(){
        for(int number: this.numbers){
            System.out.println(number);
        }
    }

}
