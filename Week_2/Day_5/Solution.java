package Week_2.Day_5;

class String_Compression {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        int i = 0 ;
        int k = 0;
        while(i < n ) {
            int c = 1;
            while(i+1 < n && chars[i]==chars[i+1]) {
                i++;
                c++;
            }
            chars[k++]=chars[i];
            if(c>1) {
                for(char ch : String.valueOf(c).toCharArray()) {
                    chars[k++]= ch;
                }
            }
            i++;
        }
        return k; 
    }
}