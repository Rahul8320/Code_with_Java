package StringsPackage;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter your string2 : ");
        String s2 = sc.nextLine();
        sc.close();

        boolean flag = isAnagram(s1, s2);
        // boolean flag = isAnagramString(s1, s2);

        if(!flag){
            System.out.println("Two strings are not anagram!");
        }
        else {
            System.out.println("Two strings are Anagram!");
        }
    }

    // time complexity O(n)
    public static boolean isAnagram( String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }

        int arr1[] = new int[256];
        // int arr2[] = new int[256];
        for(char ch:s1.toCharArray()){
            int index = (int)ch;
            arr1[index]++;
        }
        // for(char ch:s2.toCharArray()){
        //     int index = (int)ch;
        //     arr2[index]++;
        // }
        for(char ch:s2.toCharArray()){
            int index = (int)ch;
            arr1[index]--;
        }

        boolean flag = true;
        for (int i = 0; i < 256; i++) {
            // if(arr1[i] != arr2[i]){
            //     flag = false;
            //     break;
            // }
            if(arr1[i] != 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    // time complexity O(n^2)
    public static boolean isAnagramString(String s1, String s2) {
        boolean flag = false;
        boolean visited[] = new boolean[s2.length()];
        if (s1.length() == s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                flag = false;
                char ch = s1.charAt(i);
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == ch && !visited[j]){
                        visited[j] = true;
                        flag = true;
                        break;
                    }
                }
                if(!flag) break;
            }
        }
        return flag;
    }
}
