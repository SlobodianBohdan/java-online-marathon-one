// Pig Latin is a spoken "secret code" that many English-speaking children learn.
// The rules for written Pig Latin are:
// If a word begins with a consonant cluster, move it to the end and add "ay";
// If a word begins with a vowel, add "hay" to the end;
// Write a String pigLatinConverter(String text) method of the MyUtils class to convert input text.
// For example, for a given text
// Pig Latin is simply a form of jargon unrelated to Latin.
// you should get
// igPay atinLay ishay implysay ahay ormfay ofhay argonjay unrelatedhay otay atinLay.
// For more information, see https://en.wikipedia.org/wiki/Pig_Latin


import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyUtils {
    public String pigLatinConverter(String text) {
        if (text == "") {
            return "";
        }
        String textSort = "";
        String end = "";
        int noVowel = 2;
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;
            }
            int length = words[i].length();


            if (i == words.length-1 && words[i].matches(".*[.!,?]$")){
                end = words[i].substring(length-1 , length);
                words[i] = words[i].substring(0, length-1);
                length--;
            }

            if (words[i].matches(".*[-]+.*")){
                String[] wordWithDef = words[i].split("-");
                for (int j = 0; j < wordWithDef.length; j++) {
                    if (wordWithDef[j].matches("(?i)^[aeiouy].*$")) {
                        textSort += wordWithDef[j] + "hay";
                        if (i != wordWithDef.length - 1){
                            textSort += " ";
                        }
                    } else if (!wordWithDef[j].matches(".*[aeiouyAEIOUY]+.*")){
                        textSort += wordWithDef[j] + "ay";
                        if (i != wordWithDef.length - 1){
                            textSort += " ";
                        }
                    }else {
                        String firstChar = wordWithDef[j].substring(0, 1);
                        String middle = wordWithDef[j].substring(1, wordWithDef[j].length());
                        String original = wordWithDef[j];
                        wordWithDef[j] = middle + firstChar;
                        while (!wordWithDef[j].matches("(?i)^[aeiouy].*$") && wordWithDef[j].matches(".*[aeiouy]+.*")){
                            if (noVowel >= 2){
                                wordWithDef[j] = original;
                            }
                            firstChar = wordWithDef[j].substring(0, noVowel);
                            middle = wordWithDef[j].substring(noVowel, wordWithDef[j].length());
                            noVowel++;
                            wordWithDef[j] = middle + firstChar;
                        }
                        textSort += wordWithDef[j] + "ay";
                        if (j != wordWithDef.length - 1){
                            textSort += "-";
                        }else {
                            textSort += " ";
                        }
                    }

                }
                continue;
            }

            if (words[i].matches("(?i)^[aeiouy].*$")) {
                textSort += words[i] + "hay";
                if (i != words.length - 1){
                    textSort += " ";
                }
            } else if (!words[i].matches(".*[aeiouyAEIOUY]+.*")){
                textSort += words[i] + "ay";
                if (i != words.length - 1){
                    textSort += " ";
                }
            }else {
                String firstChar = words[i].substring(0, 1);
                String middle = words[i].substring(1, length);
                String original = words[i];
                words[i] = middle + firstChar;
                while (!words[i].matches("(?i)^[aeiouy].*$") && words[i].matches(".*[aeiouy]+.*")){
                    if (noVowel >= 2){
                        words[i] = original;
                    }
                    firstChar = words[i].substring(0, noVowel);
                    middle = words[i].substring(noVowel, length);
                    noVowel++;
                    words[i] = middle + firstChar;
                }
                textSort += words[i] + "ay";
                if (i != words.length - 1){
                    textSort += " ";
                }
            }
            if (i == words.length - 1){
                textSort += end;
            }
        }
        return textSort;
    }
}
