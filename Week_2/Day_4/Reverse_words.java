package Week_2.Day_4;

class Reverse_words {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder word = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++) {
            char c = s.charAt(i);
            if(c==' ') {
                sb.append(word.reverse());
                sb.append(" ");
                word.setLength(0);
            }
            else word.append(c);

        }
        sb.append(word.reverse());
        return sb.toString();   
    }
}