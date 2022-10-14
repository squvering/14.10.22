public class PigLatin {

    public static String pigIt(String str) {
        String[] words = str.split(" ");

        int k = words[0].length();

        for(int i=0; i < words.length; i++) {
            if(words[i].charAt(0) == '!' || words[i].charAt(0) == '[' || words[i].charAt(0) == '}' || words[i].charAt(0) == ',' || words[i].charAt(0) == '.' || words[i].charAt(0) == '?')
                continue;
            words[i] = "" + words[i].substring(1, words[i].length()) + words[i].charAt(0) + "ay";
        }
        String result = "";
        for(int i=0; i < words.length - 1; i++) {
            result += words[i] + " ";
        }
        result += words[words.length - 1];
        return result;
    }
}