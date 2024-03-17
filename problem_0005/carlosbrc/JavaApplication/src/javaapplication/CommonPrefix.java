package javaapplication;

public final class CommonPrefix {

    public static String commonPrefix(String[] words) {

        // control it have an array with 1 or more elements
        if (!(words != null && words.getClass().isArray())) {
            return "";
        }

        String firstWord = words[0];

        for (int i = 0; i < firstWord.length(); i++) {
            // loops all the words for each letter of the first word
            for (int j = 1; j < words.length; j++) {
                // this control than the words smaller, and equals position prefix 
                if (i >= words[j].length() || firstWord.charAt(i) != words[j].charAt(i)) {
                    // returns the letters to the before position
                    return firstWord.substring(0, i);
                }

            }
        }

        // if never get in to control into for, it is first word because 
        return firstWord;
    }
}
