import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

static public List<Integer> findAnagrams(String s, String p) {



    List<Integer> ans=new ArrayList<>();




    int[] phash=new int[26];

    for(int i=0;i<p.length();i++){
        phash[p.charAt(i)-'a']++;
    }

    int shash[]=new int[26];
    int i=0,j=0;
    for(j=0;j<p.length();j++){
        shash[s.charAt(j)-'a']++;
    }
    j=j-1;

    if(Arrays.equals(phash,shash)){
        ans.add(i);
    }
    while(j<s.length()-1){

        shash[s.charAt(i)-'a']--;
        shash[s.charAt(j+1)-'a']++;
        i++;
        j++;
        if(Arrays.equals(phash,shash)){
            ans.add(i);
        }

    }
    return ans;
}