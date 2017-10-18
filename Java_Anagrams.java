/* Gold star for me! First one I wrote, compiled, and executed without error and 
passes all tests.*/
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] count_a = new int[26];
        int[] count_b = new int[26];

        for(int i=0;i<a.length(); i++){
            char temp = Character.toLowerCase(a.charAt(i));
            count_a[temp-'a'] += 1;
        }
        for(int i=0;i<b.length(); i++){
            char temp = Character.toLowerCase(b.charAt(i));
            count_b[temp-'a'] += 1;
        }
        for(int i=0;i<26;i++){
            if(count_a[i]!=count_b[i]){
                return false;
            }
        }
        return true;
    }
