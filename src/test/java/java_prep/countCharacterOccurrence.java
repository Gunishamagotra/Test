package java_prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class countCharacterOccurrence extends javaCountWords {

   @Override
   public String Actor(){
        return "act";
    }
    public void Movie(String movname){
        System.out.println(movname);
    }

    //HOW TO COUNT CHARACTER OCCURRENCES IN A GIVEN STRING
    public static void main(String[] args){
        String str="Java is a object oriented language";
        int result= str.length()-str.replaceAll("a","").length();
        System.out.println(result);

        findDublicateCharacters();
        anagramString();
        nonRepeatedFirstCharacter();
        //java_examples jv=new java_examples();
        //jv.reverseString();

    }


    //HOW TO FING DUPLICATE CHARACTERS IN A GIVEN STRING
    public static void findDublicateCharacters(){

    String str1= "language";
    char[] arr1= str1.toCharArray();
    Map<Character, Integer> map= new HashMap<Character, Integer>();
    int count= 1;
    for(int i=0;i<arr1.length;i++){
        if (!map.containsKey(arr1[i])){
            map.put(arr1[i],count);
        }
        else{
            map.put(arr1[i],map.get(arr1[i])+1);
        }

    }

    for (Character key: map.keySet()){
        if (map.get(key)>1){
            System.out.println(key +" : " + map.get(key));
        }
    }
    }
    //CHECK ANAGRAM STRINGS
    public static void anagramString(){
        String str2="Anagram";
        String str3="margana";
        char[] arr2=str2.toLowerCase().toCharArray();
        char[] arr3=str3.toLowerCase().toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        if (Arrays.equals(arr2,arr3)){
            System.out.println("Given String are Anagran");
        }
        else{
            System.out.println("Given String are not a Anagram ");
        }
    }

    //Find first non repeated character in a given string
    public static void nonRepeatedFirstCharacter() {
        String word = "character";
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), count);
            } else
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                System.out.println("The first non-repeated character is : " +entry.getKey());
                break;
            }

        }
    }
}
