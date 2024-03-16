package javaapplication;


public final class CommonPrefix {
    ///
    public static char [] iAddArrayNative(char [] oldArray, char element){
        
        int size = oldArray.length;
        char[] newArray = new char[size+1];
        
        for(int i = 0; i < size; i++) {
            newArray[i] = oldArray[i];
        }
        
        newArray[size] = element;
        
        return newArray;
    }
    
    public static String commonPrefix(String [] words){
        if (!( words != null && words.getClass().isArray())) {
            return "";
        }
        if(words.length == 1){
            return words[0];
        }
        char [] prefix = {};
        char [] letters = words[0].toCharArray();
        int scant = words.length-1;
        for(int i = 0; i < letters.length; i++){
            int cant = scant;
            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || letters[i] != words[j].toCharArray()[i]){
                    return String.valueOf(prefix);
                }
//                System.out.println(letters[i] + " " + words[j].toCharArray()[i]);
                if(letters[i] == words[j].toCharArray()[i] ){
                    cant--;
                    if (cant == 0){
                        prefix = iAddArrayNative(prefix, letters[i]);
                    }
                }
                
            }
        }
        
        return String.valueOf(prefix);
    }
}
