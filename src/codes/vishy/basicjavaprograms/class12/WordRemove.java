//psg 269 prog 7
package codes.vishy.basicjavaprograms.class12;
import java.util.*;
public class WordRemove{
    public static void main(String args[]){
        System.out.println("Input your string");
        Scanner in=new Scanner(System.in);
        String st=in.nextLine();
        System.out.println("Enter word to remove");
        String word=in.next();
        System.out.println("Enter position in sentence");
        int n=in.nextInt();
        System.out.println("Sentence after removing word");
        System.out.println(stringFormat(st,word,n));
    }
    
    public static String stringFormat(String n, String w, int q){
        String f="";
        String m="";
        char ch=n.charAt(n.length()-1);
        n=n.substring(0,n.length()-1);
        if(ch=='.'||ch=='?'||ch=='!'){
            StringTokenizer st=new StringTokenizer(n);
            int t=st.countTokens();
            for(int i=1;i<=t;i++){
                m=st.nextToken().trim();
                if((!w.equals(m))||i!=q){
                    f=f+" "+m;
                }
            }
            f=f.trim();
            f=f+ch; 
        }
        return f;
    }
    
    /*public static String stringFormat(String n,String w){
        String f="";
        int count=0;
        String m="";
        char l=n.charAt(n.length()-1);
        if(l=='.'||l=='!'||l=='?'){
            n=n.substring(0,n.length()-1);
        }
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            m=m+c;
            while((((int)c>=65)&&((int)c<=90))||(((int)c>=97)&&((int)c>=122))){
                if(i==1){
                    if(((int)n.charAt(i-1))==32){
                        m=m.trim();
                        count++;
                    }
                    if(m==w){
                        System.out.println("WORD POSITION IN THE SENTENCE: "+count);
                        m="";
                    }else{
                        f=f+m+" ";
                        m="";
                    }
                }
            }
        }
        f=f.trim();
        f=f+l;
        return f;
    }*/
}