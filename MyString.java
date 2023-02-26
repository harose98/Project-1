public class MyString{
    char[] characters;
    int curr_length;

    public MyString(){
        characters = null;
        curr_length = 0;
    }

    public MyString(String word){
        curr_length = word.length();
        characters = new char[curr_length];
        for(int i = 0; i < characters.length; i++){
            characters[i] = word.charAt(i);
        }
    }

    public MyString(MyString myString){
        curr_length = myString.curr_length;
        characters = new char[curr_length];
        for(int i = 0; i < characters.length; i++){
            characters[i] = myString.characters[i];
        }
    }

    public int length(){
        return curr_length;
    }

    private void ensureCapacity(int min){

    }

    public String toString(){
        String str = "";
        for(int i = 0; i < characters.length; i++){
            str += characters[i];
        }
        return str;
    }

    public MyString concat(MyString ms){
        return new MyString(toString() + ms.toString());
    }

    public boolean equals(MyString ms){
        if(toString().equals(ms.toString())){
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(MyString ms){
        return toString().compareTo(ms.toString());
    }

    public char get(int num){
        if(num >= 0 && num < curr_length){
            return characters[num];
        } else {
            return '0';
        }
    }

    public MyString toUpper(){
        return new MyString(toString().toUpperCase());
    }

    public MyString toLower(){
        return new MyString(toString().toLowerCase());
    }

    public String substring(int num){
        return toString().substring(num);
    }

    public MyString substring(int num1, int num2){
        return new MyString(toString().substring(num1, num2));
    }

    public int indexOf(MyString ms){
        return toString().indexOf(ms.toString());
    }

    public int lastIndexOf(MyString ms){
        return toString().lastIndexOf(ms.toString());
    }
}