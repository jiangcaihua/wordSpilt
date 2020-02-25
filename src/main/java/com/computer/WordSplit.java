package com.computer;

import java.util.ArrayList;

/**
 * Created by jiangch on 2020/2/25.
 */

    public class WordSplit {

        public static void main(String[] args) {
            wordSplit("ilikesamsungmobile");
        }


        public static void wordSplit(String s){
            ArrayList<String> al = new ArrayList<String>();
            wordSplitRec(s, al);
        }

        public static void wordSplitRec(String s, ArrayList<String> al){
            int len = s.length();
            if(len == 0){
                System.out.println(al);
                return;
            }

            for(int i=1; i<=len; i++){
                String substr = s.substring(0, i);
                if(dictionaryContains(substr)){
                    al.add(substr);
                    wordSplitRec(s.substring(i), al);
                    al.remove(al.size()-1);
                }
            }
        }

        private static boolean dictionaryContains(String word){
            String[] dict = {"i","like","sam","sung","man","mango",
                    "samsung","mobile","ice","cream","man","go","cream"};
            for(int i=0; i<dict.length; i++){
                if(dict[i].equals(word)){
                    return true;
                }
            }
            return false;
        }


    }
